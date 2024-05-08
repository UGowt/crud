FROM eclipse-temurin:17
COPY target/crud.jar crud.jar
CMD ["java","-jar","crud.jar"]