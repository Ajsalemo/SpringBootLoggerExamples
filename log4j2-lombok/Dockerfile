FROM openjdk:11.0-slim

ARG JAR_FILE=log4j2-lombok-0.0.1-SNAPSHOT.jar
RUN mkdir /app

# COPY sshd_config /etc/ssh/
COPY init_container.sh /opt/
COPY sshd_config /etc/ssh/

# Start and enable SSH
ENV SSH_PASSWD "root:Docker!"
RUN apt-get update \
    && apt-get install -y --no-install-recommends dialog \
    && apt-get update \
    && apt-get install -y --no-install-recommends openssh-server \
    && echo "$SSH_PASSWD" | chpasswd \
    && chmod u+x /opt/init_container.sh

# Copy the .jar to the container under the /app directory
COPY target/${JAR_FILE} /app/${JAR_FILE}
# Rename the SNAPSHOT jar to 'app.jar' for simplicity
RUN mv /app/${JAR_FILE} /app/app.jar

# Expose port 8080 for the application and 2222 for SSH access
EXPOSE 8080 2222

ENTRYPOINT [ "/opt/init_container.sh" ]
