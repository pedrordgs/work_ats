#!/bin/bash

for p in projects_maven/*; do
  cd $p
  mvn clean verify sonar:sonar
  cd ../..
done
