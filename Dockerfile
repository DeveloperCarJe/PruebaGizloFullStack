FROM openjdk:11
ADD /target/Prueba-Tecnica-BackEnd.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]