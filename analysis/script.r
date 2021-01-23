wd <- getwd()
setwd(wd)
values <- read.csv("../results/sonarqube.csv")
refactor <- read.csv("../results/sonarqube_refactor.csv")

graphs <- function(df, path){
  png(file=paste("../results/graphs",path,"/bugs.png", sep=""))
  hist(df$bugs, xlab="Quantity", main="Bugs")
  invisible(dev.off())

  png(file=paste("../results/graphs",path,"/code_smells.png", sep=""))
  hist(df$code_smells, xlab="Quantity", main="Code Smells")
  invisible(dev.off())

  png(file=paste("../results/graphs",path,"/technical_debt.png", sep=""))
  hist(df$sqale_index, xlab="Work days", main="Technical Debt")
  invisible(dev.off())

  png(file=paste("../results/graphs",path,"/duplicated_blocks.png", sep=""))
  hist(df$duplicated_blocks, xlab="Quantity", main="Duplicated Blocks")
  invisible(dev.off())

  png(file=paste("../results/graphs",path,"/duplicated_lines_density.png", sep=""))
  hist(df$duplicated_lines_density, xlab="Quantity", main="Duplicated lines of code")
  invisible(dev.off())

  png(file=paste("../results/graphs",path,"/complexity.png", sep=""))
  hist(df$complexity, xlab="Quantity", main="Cyclomatic complexity")
  invisible(dev.off())
}

maxfunction <- function(df, df2) {
    y <- max(df2)
    x <- df$name[df2==y]
    cat("Max: ", y, "- Projeto:", x, "\n")
}
minfunction <- function(df, df2) {
    y <- min(df2)
    x <- df$name[df2==y]
    cat("Min: ", y, "- Projeto:", x, "\n")
}

meanfunction <- function(df) {
    y <- mean(df)
    cat("Mean:", y, "\n")
}

worst <- function(df){
    x <- rowSums(df[,-1])
    y <- df$name[x==max(x)]
    cat("THE WORST PROJECT WAS", y,"\n")
}

best <- function(df){
    x <- rowSums(df[,-1])
    y <- df$name[x==min(x)]
    cat("THE BEST PROJECT WAS", y,"\n")
}

graphs(values, "")
graphs(values, "_refactor")

cat("----------------------------------------------------------\n")
cat("|                                                        |\n")
cat("|                     NO REFACTORING                     |\n")
cat("|                                                        |\n")
cat("----------------------------------------------------------\n")

cat("\n")
cat("\n")

cat("BUGS\n")
maxfunction(values, values$bugs)
minfunction(values, values$bugs)
meanfunction(values$bugs)
cat("\n")

cat("CODE SMELLS\n")
maxfunction(values, values$code_smells)
minfunction(values, values$code_smells)
meanfunction(values$code_smells)
cat("\n")

cat("TECHNICAL DEBT\n")
maxfunction(values, values$sqale_index)
minfunction(values, values$sqale_index)
meanfunction(values$sqale_index)
cat("\n")

cat("DUPLICATED BLOCKS\n")
maxfunction(values, values$duplicated_blocks)
minfunction(values, values$duplicated_blocks)
meanfunction(values$duplicated_blocks)
cat("\n")

cat("DUPLICATED LINES OF CODE\n")
maxfunction(values, values$duplicated_lines_density)
minfunction(values, values$duplicated_lines_density)
meanfunction(values$duplicated_lines_density)
cat("\n")

cat("CYCLOMATIC COMPLEXITY\n")
maxfunction(values, values$complexity)
minfunction(values, values$complexity)
meanfunction(values$complexity)
cat("\n")

best(values)
cat("\n")

worst(values)
cat("\n")

cat("----------------------------------------------------------\n")
cat("|                                                        |\n")
cat("|                    AFTER REFACTORING                   |\n")
cat("|                                                        |\n")
cat("----------------------------------------------------------\n")

cat("\n")
cat("\n")

cat("BUGS\n")
maxfunction(refactor, refactor$bugs)
minfunction(refactor, refactor$bugs)
meanfunction(refactor$bugs)
cat("\n")

cat("CODE SMELLS\n")
maxfunction(refactor, refactor$code_smells)
minfunction(refactor, refactor$code_smells)
meanfunction(refactor$code_smells)
cat("\n")

cat("TECHNICAL DEBT\n")
maxfunction(refactor, refactor$sqale_index)
minfunction(refactor, refactor$sqale_index)
meanfunction(refactor$sqale_index)
cat("\n")

cat("DUPLICATED BLOCKS\n")
maxfunction(refactor, refactor$duplicated_blocks)
minfunction(refactor, refactor$duplicated_blocks)
meanfunction(refactor$duplicated_blocks)
cat("\n")

cat("DUPLICATED LINES OF CODE\n")
maxfunction(refactor, refactor$duplicated_lines_density)
minfunction(refactor, refactor$duplicated_lines_density)
meanfunction(refactor$duplicated_lines_density)
cat("\n")

cat("CYCLOMATIC COMPLEXITY\n")
maxfunction(refactor, values$complexity)
minfunction(refactor, values$complexity)
meanfunction(refactor$complexity)
cat("\n")

best(refactor)
cat("\n")

worst(refactor)
cat("\n")
