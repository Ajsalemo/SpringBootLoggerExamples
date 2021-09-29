FROM maven:3.8.1 as build
WORKDIR /app
COPY . /app
RUN mvn -f /app/pom.xml clean package

FROM openjdk:11-jre
COPY --from=build /app/target/log4j2-0.0.1-SNAPSHOT.jar /app/log4j2-0.0.1-SNAPSHOT.jar

COPY init_container.sh /opt/
COPY sshd_config /etc/ssh/

ENV SSH_PASSWD "root:Docker!"
RUN apt-get update \
    && apt-get install -y --no-install-recommends dialog \
    && apt-get update \
    && apt-get install -y --no-install-recommends openssh-server \
    && echo "$SSH_PASSWD" | chpasswd \
    && chmod u+x /opt/init_container.sh
    
EXPOSE 8080
ENTRYPOINT [ "/opt/init_container.sh" ]
