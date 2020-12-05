#!/bin/bash

ulimit -n 4096
make
./ats > setup_ats.sh
chmod +x setup_ats.sh
./setup_ats.sh
make clean

# copy pom.xml to every project
echo projects_maven/* | xargs -n 1 cp pom.xml

# get main class
for p in projects_maven/*; do
  cd $p
  MainClass=$(grep -RH "void main[^a-zA-Z]" * | awk -F ":" {'print $1'} | sed 's/src\/main\/java\///;s/\.java//;s/\//./g')
  sed -i "s/<mainClass>/<mainClass>$MainClass/" pom.xml
  mvn compile
  mvn package
  cd ../..
done
