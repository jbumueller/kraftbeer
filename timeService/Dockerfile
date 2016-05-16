# For x86 binaries
# FROM java:8

# For ARM binaries
FROM resin/rpi-raspbian:jessie

RUN apt-get update && apt-get install -y openjdk-8-jre-headless --no-install-recommends && rm -rf /var/lib/apt/lists/*

# Define commonly used JAVA_HOME variable
ENV JAVA_HOME /usr/lib/jvm/java-8-openjdk-armhf

# App deployment

WORKDIR /opt/timeService
COPY ./target/*.jar /opt/timeService

EXPOSE 9090 9090
ENTRYPOINT ["java", "-jar", "timeService-0.0.1-SNAPSHOT.jar"]