FROM openjdk:21-ea-1-jdk
COPY target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["sh","-c","java -Djava.security.egd=file:/dev/urandom -jar /app.jar ${0} ${@}"]