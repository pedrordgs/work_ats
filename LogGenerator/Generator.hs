module Generator where

import Test.QuickCheck
import Control.Monad
import Control.Arrow
import Cp
import Data.List
import Data.List.Split (splitOn)
import Data.Char
import Datasets.Companies (companies)
import Datasets.First_names (first_names)
import Datasets.Last_names (last_names)
import Datasets.Produtos (produtos)
import Numeric
import Types

------------------------------------------------------------------------- MAIN LOGIC ---------------------------------------------------------------------

genName = liftM2 (\x y -> x ++ " " ++ y) (elements first_names) (elements last_names)
genNIF = chooseInt (111111111,999999999)
genRadius = R <$> chooseInt (0,200) 
genPrice = Pr <$> genPriceF
genPriceF = choose (0,100)
genQuantity = choose (0,10)

genLoc = liftM2 L (choose (-90,90)) (choose (-180,180))

genUser = liftM2 U genName genLoc

genVolunteer = liftM3 V genName genLoc genRadius

genTransporter = liftM5 T (elements companies) genLoc genNIF genRadius genPrice

genStore = liftM2 S (elements companies) genLoc

genProduct = P <$> elements produtos

genPIO prods = liftM3 PIO (elements prods) genPriceF genQuantity

nubGenAux :: Eq a => [a] -> Int -> Gen a -> Gen [a]
nubGenAux acc 0 _ = return acc
nubGenAux acc n g = g >>= (\x -> if elem x acc then nubGenAux acc n g else nubGenAux (x:acc) (n-1) g)

nubGen :: Eq a => Int -> Gen a -> Gen [a]
nubGen = nubGenAux []

genIded :: (Eq a) => Int -> Range -> Gen a -> IO [Id a]
genIded n r g = generate $ liftM2 zip codes values where
    codes = nubGen n $ choose r 
    values = nubGen n g

genOrder :: [ID] -> [ID] -> [Id Product] -> Gen Order
genOrder us ss prods = liftM3 order (elements us) (elements ss) (sized $ flip nubGen $ genPIO prods) where
    order ui si l = O ui si (pio_price l) l
    pio_price = sum . map (uncurry (*) . (price &&& quant))

main = do
    users <- genIded 5 (0,100) genUser
    volunteers <- genIded 5 (0,100) genVolunteer
    transporters <- genIded 5 (0,100) genTransporter
    stores <- genIded 5 (0,100) genStore
    products <- genIded 300 (0,1000) genProduct
    orders <- genIded 5 (0,10000) $ genOrder (map fst users) (map fst stores) products
    let accepted = init $ concatMap ((\x -> "Aceite:e" ++ x ++ "\n") . show . fst) orders
    writeFile "logs.txt" $ fullPrint users volunteers transporters stores orders ++ "\n" ++ accepted

---------------------------------------------------------- CREATES HASKELL BD FUNCTIONS FROM CSV FILES ---------------------------------------------------

-- s = function/module name
create_list_file :: String -> String -> String -> String -> IO ()
create_list_file src pkg s dest = do
    csv <- init . splitOn "\n" <$> readFile src
    let full = "module " ++ pkg ++ "." ++ s ++ " where\n" ++ map toLower s ++ " = " ++ show csv
    writeFile dest full

create_list_file_ez pkg s = create_list_file (pkg ++ "/" ++ s_lower ++ ".csv") pkg s (pkg ++ "/" ++ s_lower ++ ".hs") where
    s_lower = map toLower s

------------------------------------------------------------------------- UTILITIES ----------------------------------------------------------------------

-- Injects the id with a signature into the printed string
inject :: (Show a) => String -> Id a -> String
inject sig = (\(x,[y,z]) -> ezShowComma [y ++ ":" ++ sig ++ show x,z]) . (id *** (splitOn ":" . show))

ez_inject :: (Show a) => String -> [Id a] -> String
ez_inject sig = ezShow "\n" . map (inject sig)

fullPrint :: [Id User] -> [Id Volunteer] -> [Id Transporter] -> [Id Store] -> [Id Order] -> String
fullPrint u v t s o = ezShow "\n" [ez_inject "u" u, ez_inject "v" v, ez_inject "t" t, ez_inject "l" s, ez_inject "e" o]