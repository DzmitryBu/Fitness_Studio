FROM eclipse-temurin:17-jre-focal
MAINTAINER BulDima

ADD ./target/user-service-0.0.1-SNAPSHOT.jar /app/

CMD ["java", "-Xmx200m", "-jar", "/app/user-service-0.0.1-SNAPSHOT.jar"]

EXPOSE 8080 8089