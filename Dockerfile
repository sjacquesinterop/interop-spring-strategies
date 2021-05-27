FROM maven:3.6-jdk-11 AS build

COPY src /home/app/src
COPY pom.xml /home/app

RUN mvn -f /home/app/pom.xml clean package



FROM openjdk:11-jre-slim

# run with user 1001 and be prepared for be running in OpenShift too
RUN adduser root --no-create-home --disabled-password 1001
RUN chown -R 1001 /usr/local/lib
RUN chmod -R "g+rwX" /usr/local/lib
RUN chown -R 1001:root /usr/local/lib
USER 1001

COPY --from=build /home/app/target/*.jar /usr/local/lib/app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app.jar"]