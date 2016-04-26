FROM java:8

WORKDIR /opt/timeService
COPY ./target/*.jar /opt/timeService

EXPOSE 9090 9090
ENTRYPOINT ["java", "-jar", "timeService-0.0.1-SNAPSHOT.jar"]