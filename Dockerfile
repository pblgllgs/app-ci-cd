FROM maven:3.8.7-eclipse-temurin-17-alpine@sha256:8592edb5fa55225ae4f2e218d6caf719ebd88ecb56698b563c2b71936544981f AS build
RUN mkdir /project
COPY . /project
WORKDIR /project
RUN mvn clean package -DskipTests

FROM eclipse-temurin:17-jre-alpine@sha256:da8bbb33e7e61396625b2e47dee1e6f6c164a0321ed4a80b2054a9a398057570
RUN apk add dumb-init curl && apk cache clean
RUN mkdir /app
RUN addgroup --system javauser && adduser -S -s /bin/false -G javauser javauser
COPY --from=build /project/target/app-ci-cd-2.0.0.jar /app/app-ci-cd-2.0.0.jar
WORKDIR /app
RUN chown -R javauser:javauser /app
USER javauser
CMD "dumb-init" "java" "-jar" "app-ci-cd-2.0.0.jar"