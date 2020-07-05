# Condenast
## Spring Boot Microservice application

This microvervice is based on Spring Boot Architecture. The purpose of this microvervice is to print hello world when GET API is called, http://hostname:8080/api/v1/message

## Run in Local Dev environment
Execute ```mvn spring-boot:run``` from project root directory

## To build the docker image and push it to docker hub
1. run ```mvn package``` from project root directory
2. copy generated jar from target directory to src/main/java/com/condenast/interview/script/
3. run ```cd src/main/java/com/condenast/interview/script/```
4. To build docker image run ```docker build -t siddharthadhanetwal/condenast .```
5. To push docker image run ```docker push siddharthadhanetwal/condenast:latest .```

## Run docker container locally
```docker run -p 8080:8080 siddharthadhanetwal/condenast```

## Deploy this image in kubernetes cluster
1. ```cd src/main/java/com/condenast/interview/script/```
2. To deploy the pod please run this command in your cluster ```kubectl apply -f deployment.yaml```
3. To make your container accept connection on port 8080, please run this command ```kubectl port-forward svc/condenast 8080:8080```
