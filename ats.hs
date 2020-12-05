module Main where

import Data.List
import Control.Monad
import System.Directory
import Control.Monad.Extra
import Control.Arrow
import Data.List.Split hiding (split)
import Data.Maybe
import System.Environment
import System.IO
import System.Process
import Cp
import Iso

type Package = String

format :: FilePath -> IO [FilePath]
format d = fmap (map (d ++) . flip (\\) [".",".."]) $ getDirectoryContents d

func :: FilePath -> IO [FilePath]
func d = do (a,b) <- partitionM doesFileExist =<< format d
            let (aa, bb) = (filter filterFunc a, map (\x -> x ++ "/") b)
            case bb of [] -> return aa
                       x -> func_aux (aa,bb)
    where
        filterFunc x = (not . isPrefixOf "."  . awful $ x) && ("java" `isSuffixOf` x)
        awful = reverse >=< takeWhile (/= '/')

func_aux :: ([FilePath], [FilePath]) -> IO [FilePath]
func_aux (a,b) = do l <- sequence $ map func b
                    return $ a ++ concat l

foo :: IO [([Char], [FilePath])]
foo = sequence . map (dstr . split fullPath func) =<< dirFilesFullPath
    where strip = (++ "/src/main/java/") . reverse >=< takeWhile (/= '/') . tail
          fullPath s = fmap (++ "/projects_maven/") getCurrentDirectory >>= pure . (++ (strip s))
          dirFilesFullPath = getCurrentDirectory >>= pure . (++ "/projectsPOO_1920/") >>= format >>= return . map (snoc "/")
          -- dirFilesFullPath = getCurrentDirectory >>= pure . (++ "/mini_projects/") >>= format >>= return . map (snoc "/")
          snoc a s = s ++ a

-- saca package do ficheiro
getPkg :: FilePath -> IO Package
getPkg = readFileOP >=> return . cutMaybe . helper . splitOn "\n"
    where cutMaybe = cond isNothing nil fromJust
          readFileOP = flip openFile ReadMode >=> (\h -> do {hSetEncoding h latin1; hGetContents h})
          replace a b l = map (\x -> if x == a then b else x) l
          helper = find (isPrefixOf "package") >=> return . replace '.' '/' . tail . dropWhile (/= ' ') . (reverse >=< tail . dropWhile (/= ';'))

pkgSort :: [FilePath] -> IO [(Package, [FilePath])]
pkgSort =  fmap (map (split (p1 . head) (map p2)) . groupBy factorG . sortBy factorS) . sequence . map (rstr . split getPkg id)
    where factorS x y = compare (p1 x) (p1 y)
          factorG x y = p1 x == p1 y


f (x, l) = concatMap (\(p, lf) -> (if p /= "" then "mkdir -p " ++ x ++ p else ""):map (\fi -> "cp \"" ++ fi ++ "\" " ++ x ++ p) lf) l

allCommands = fmap (concatMap ((uncurry (:)) . split ((++) "mkdir -p " . p1) f)) $ commands

runCommands = allCommands >>= sequence . map callCommand

commands = foo >>= sequence . map (lstr . (id >< pkgSort))

main = do
  allCommands >>= mapM_ putStrLn
