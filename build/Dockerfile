FROM adoptopenjdk/maven-openjdk11:latest AS builder

RUN apt-get update && apt-get install -y git
RUN git clone https://github.com/hashitaro330/backend.git /var/local/aws-ecs
RUN mvn install -f /var/local/aws-ecs/pom.xml

FROM adoptopenjdk/openjdk11:alpine-slim
RUN apk --update add tzdata && \
    cp /usr/share/zoneinfo/Asia/Tokyo /etc/localtime && \
    apk del tzdata && \
    rm -rf /var/cache/apk/* && \
    mkdir -p /opt/app/
COPY --from=builder /var/local/aws-ecs/target/sample-aws-ecs-backend-0.0.1-SNAPSHOT.jar /opt/app/

EXPOSE 8080

CMD java -jar -Dspring.profiles.active=production /opt/app/sample-aws-ecs-backend-0.0.1-SNAPSHOT.jar