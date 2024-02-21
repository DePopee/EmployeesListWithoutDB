FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY target/*.jar app-0.0.1.jar
ENTRYPOINT ["java", "-jar", "/app-0.0.1.jar"]
EXPOSE 8080