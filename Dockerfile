FROM eclipse-temurin:17

COPY target/deployement-0.0.1-SNAPSHOT.jar deployement-0.0.1-SNAPSHOT.jar

CMD ["java","-jar","deployement-0.0.1-SNAPSHOT.jar"]