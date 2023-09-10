FROM eclipse-temurin:17

EXPOSE 8080

COPY ./target/app-ci-cd-0.0.1-SNAPSHOT.jar /usr/app

WORKDIR /user/app

ENTRYPOINT ["java", "-jar","app-ci-cd-0.0.1-SNAPSHOT.jar"]