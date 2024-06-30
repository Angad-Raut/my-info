FROM openjdk:17-jdk-slim
EXPOSE 9090
ADD target/my-info-app.jar my-info-app.jar
ENTRYPOINT ["java","-jar","/my-info-app.jar"]