FROM java:8-alpine
RUN apk update && apk add curl
ADD target/k8s-learn-1.0-SNAPSHOT.jar hello.jar
EXPOSE 8090
ENTRYPOINT ["java","-jar","hello.jar"]
