FROM maven:3.8.1-openjdk-11 as build
COPY . /app
WORKDIR /app
RUN mvn -f /app/pom.xml clean package

FROM maven:3.8.1-openjdk-11
COPY --from=build /app/target/log4j2-0.0.1-SNAPSHOT.jar /app/log4j2-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT [ "java", "-jar", "/app/log4j2-0.0.1-SNAPSHOT.jar" ]