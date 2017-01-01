FROM java:8

# App deployment
WORKDIR /opt/kraftbike/api
COPY ./target/*.jar /opt/kraftbike/api

EXPOSE 9090 9090
ENTRYPOINT ["java", "-jar", "api-0.0.1-SNAPSHOT.jar"]