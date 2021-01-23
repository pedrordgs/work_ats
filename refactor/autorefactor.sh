#!/bin/bash


mkdir projects_refactor
cp -r ../projects_maven/* projects_refactor

for ID in projects_refactor/*; do
  AUTOREFACTOR_ECLIPSE=autorefactor/eclipse/eclipse ./autorefactor/AutoRefactorCli/cli/target/autorefactor/bin/autorefactor apply --project $ID/.project --source src/main/java --refactorings $(cat refactors.txt) 2>> exceptions
done


echo "Refactor completed"
