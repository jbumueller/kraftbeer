#!/bin/sh

# Delete all docker containers
for i in `docker ps -a|grep -v 'CONTAINER'| sed -e "s/\s.*$//"`; do docker kill $i; docker rm $i; done

# Delete all docker images except for java
for i in `docker images |grep -v 'REPOSITORY'|grep -v 'java'| sed -e "s/\S*\s*\S*\s*//;s/\s\s*.*//"`; do docker rmi -f $i; done

mvn clean install

# Build and run container
docker build -t time-service .
eval $(docker-machine env)
docker run -itd -p 9090:9090 time-service 9090 