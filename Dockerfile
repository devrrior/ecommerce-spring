FROM openjdk:20-ea-11-slim-buster

ADD target/ecommerce-spring-0.0.1-SNAPSHOT.jar ecommerce-spring.jar

ENTRYPOINT ["java", "-jar", "ecommerce-spring.jar"]
