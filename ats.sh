#!/bin/bash

echo "=========================================="
echo "========== Starting Structuring =========="
echo "=========================================="

cd structuring
./structuring.sh
cd ..

echo "========================================="
echo "========= Starting Autorefactor ========="
echo "========================================="

cd refactor
./autorefactor.sh
cd ..

echo "=========================================="
echo "=========== Starting Sonarqube ==========="
echo "=========================================="

cd sonarqube
./sonarqube.sh
cd ..

echo "========================================="
echo "=========== Starting Analysis ==========="
echo "========================================="

cd analysis
./analysis.sh
cd ..
