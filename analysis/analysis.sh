#!/bin/bash


Rscript script.r > ../results/metrics_analysis

mkdir projects

cp -r ../projects_maven/67 projects
cp -r ../projects_maven/83 projects
cp -r ../projects_maven/2 projects

cp pom.xml projects/67
cp pom.xml projects/83
cp pom.xml projects/2

../helpers/javaswitcher.sh 8

for p in projects/*; do
  cd $p
  PROJECT=$(echo $p | awk -F '/' {'print $2'})
  CLASS=$(grep -RH "void main[^a-zA-Z]" * | awk -F ":" {'print $1'} | sed 's/src\/main\/java\///;s/\.java//;s/\//./g')
  sed -i "s/PROJECT_ID/$PROJECT/;s/CLASSE/$MainClass/" pom.xml 2> /dev/null
  mvn -DmemoryInMB=2000 -Dcores=4 evosuite:generate evosuite:export surefire-report:report
  mvn cobertura:cobertura
  mkdir -p ../../../results/tests/$PROJECT
  cp -r target/site/* ../../../results/tests/$PROJECT
  Run RAPL and write results to file
  cd ../..
done


