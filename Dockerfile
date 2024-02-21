FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY --chown=node:node ./package*.json ./
ENTRYPOINT ["java", "-jar", "/app-0.0.1.jar"]
EXPOSE 8080