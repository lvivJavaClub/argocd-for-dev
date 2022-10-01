FROM openjdk:17-jdk
EXPOSE 8080
RUN mkdir /service

ADD ./target/demo-0.0.1-SNAPSHOT.jar /service/demo.jar

CMD ["java", "-jar", "/service/demo.jar"]
