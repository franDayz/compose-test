FROM openjdk:8-jdk-alpine

ADD target/*.jar config-server.jar

ENTRYPOINT ["java","-jar", "config-server.jar"]