FROM openjdk:20-ea-11-slim-buster

ADD target/*.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
