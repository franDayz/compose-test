FROM openjdk:8-jdk-alpine
COPY target/*.jar /opt/client/client.jar
COPY client.sh /opt/client
RUN chmod 755 /opt/client/client.sh