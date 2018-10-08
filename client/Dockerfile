FROM openjdk:8-jdk-alpine

ADD target/*.jar client.jar

ENTRYPOINT ["java","-jar", "client.jar"]