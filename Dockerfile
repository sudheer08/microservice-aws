FROM adoptopenjdk/openjdk8
ADD build/libs/microservice-aws-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java" , "-jar", "app.jar"]
EXPOSE 8080