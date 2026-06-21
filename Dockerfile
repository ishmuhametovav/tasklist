FROM maven:3.9.16-amazoncorretto-17-alpine AS build
WORKDIR /
COPY /src /src
COPY pom.xml /
RUN mvn -f /pom.xml clean package

FROM amazoncorretto:17-alpine
WORKDIR /
COPY /src /src
COPY --from=build /target/*.jar application.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","application.jar"]