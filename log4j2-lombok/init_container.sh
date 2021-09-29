#!/bin/sh
set -e

echo "Starting SSH ..."
service ssh start

echo "Running startup command 'java -jar /app/log4j2-lombok-0.0.1-SNAPSHOT.jar'"
java -jar /app/log4j2-lombok-0.0.1-SNAPSHOT.jar