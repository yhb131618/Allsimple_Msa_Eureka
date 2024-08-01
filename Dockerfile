# Dockerfile

# 베이스 이미지 정의
FROM openjdk:17-jdk-alpine as builder

VOLUME /tmp

# 빌드된 JAR 파일 복사
COPY --from=builder /app/build/libs/*.jar app.jar

EXPOSE 8008
# 애플리케이션 실행
ENTRYPOINT ["java", "-jar", "app.jar"]

