FROM java:8

WORKDIR /opt/helloService
COPY ./target/*.jar /opt/helloService

EXPOSE 8080 8080
ENTRYPOINT ["java", "-jar", "helloService-0.0.1-SNAPSHOT.jar"]