FROM openjdk:24-slim-bookworm
COPY build/libs/kotlin-restful-api-0.0.1-SNAPSHOT.jar /app/application.jar

CMD ["java", "-jar","/app/application.jar"]