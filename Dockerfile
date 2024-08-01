# Dockerfile

# 베이스 이미지 정의
FROM openjdk:17-jdk-alpine as builder

VOLUME /tmp

COPY build/libs/eureka-server.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]

