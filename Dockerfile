FROM java:8-jdk-alpine

RUN apk add --update \
    curl \
    && rm -rf /var/cache/apk/*

RUN ls -ltr
COPY devops-api-1.0.0.jar app.jar
RUN sh -c 'touch app.jar'
ENTRYPOINT ["java","-jar","app.jar"]