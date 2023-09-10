FROM eclipse-temurin:17

EXPOSE 8080

COPY ./target/app-ci-cd-1.0.0.jar /usr/app

WORKDIR /user/app

ENTRYPOINT ["java", "-jar","app-ci-cd-1.0.0.jar"]