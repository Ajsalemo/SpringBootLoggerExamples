#!/bin/sh
set -e

echo "Starting SSH ..."
service ssh start

echo "Running startup command 'java -jar /app/app.jar'"
java -jar /app/app.jar