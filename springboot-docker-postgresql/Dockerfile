FROM openjdk:8-alpine

EXPOSE 8080

ADD target/rest-world.jar rest-world.jar

ENTRYPOINT ["java", "-jar", "rest-world.jar"]

