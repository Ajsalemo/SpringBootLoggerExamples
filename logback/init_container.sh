#!/bin/sh
set -e

echo "Starting SSH ..."
service ssh start

echo "Running startup command 'java -jar /app/logback-0.0.1-SNAPSHOT.jar'"
java -jar /app/logback-0.0.1-SNAPSHOT.jar