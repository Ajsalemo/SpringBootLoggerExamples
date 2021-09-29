#!/bin/sh
set -e

echo "Starting SSH ..."
service ssh start

echo "Running startup command 'java -jar /app/app.jar'"
java -jar /app/log4j2-0.0.1-SNAPSHOT.jar