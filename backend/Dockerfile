FROM gradle:latest as gradleImage
COPY . /home/gradle/source
WORKDIR /home/gradle/source
RUN ./gradlew bootJar

FROM openjdk:17-jdk-alpine
COPY --from=gradleImage /home/gradle/source/build/libs/todolist-0.0.1-SNAPSHOT.jar /app/
WORKDIR /app

ENTRYPOINT ["java", "-jar", "todolist-0.0.1-SNAPSHOT.jar"]







