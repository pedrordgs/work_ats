#!/bin/bash

echo "Running sonarqube on background"

# ./sonarqube-8.5.1.38104/bin/linux-x86-64/sonar.sh console &

# sleep 30

for p in ../refactor/projects_refactor/*; do
  cd $p
  mvn clean verify sonar:sonar
  cd ../../../sonarqube
done

python3 extract_sonarqube.py sonarqube_refactor true

for p in ../projects_maven/*; do
  cd $p
  mvn clean verify sonar:sonar
  cd ../../sonarqube
done

python3 extract_sonarqube.py sonarqube false

echo "It was impossible to generate a .jar file for the following projects:"

cd ../projects_maven
comm -3 <(find . -iname '*.jar' | awk -F / '{print $2}' | sort) <(ls | sort) | awk '{print $1}'


