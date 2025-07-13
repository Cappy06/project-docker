FROM openjdk:21
ARG JAR_FILE=target/project-docker-1.0.0.jar
VOLUME /tmp
EXPOSE 8080
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]