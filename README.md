# Backend Usuarios.
# Resumen
 * El BackEnd es realizada en la plataforma de SPRING TOOLS SUITE4, que es un ambiente para Eclipse. En la que se desarrollo un micorservicio para Almacenar, Actualizar, Eliminar y Listar usuarios de una BD.  

* La BD utilizada para el almacenamiento de informacion es MongoDB, es una BD NOSQL en las que no ayuda flexibilidad al momento de la creacion de Schema.  

* El Back y la BD estan contenerizado y ejecutandose por debajo. En las que nos ayudara a ahorrar muchos recursos.  

# Orquestación del MongoDB
Para la orquestacion de la BD se utilizaron los siguientes comandos desde la consola:

1.- Instalacion del MongoDB y creacion de imagen  
 `docker pull mongo:latest`
 
2.- Levantar BD  
`docker run -d -p 27017:27017 --name gizlomongodb mongo:latest`  

![Docker MongoDb](https://raw.githubusercontent.com/DeveloperCarJe/PruebaGizloFullStack/master/Capturas/Mongodb.PNG)

# Orquestación del BackEnd y Generar Build

1.- Para Generar el Build(.jar) del backend, procederemos a limpiar el codigo. Dentro del SPRING TOOLS SUITE4, Se realizara click derecho al proyecto:  
    
    DEBUG AS --> Maven clear
    
2.- Luego se procede a generar el dist/.jar:  

    DEBUG AS --> Maven install  
 
3.- Archivo DockerFile:  

    FROM openjdk:11
    ADD /target/Prueba-Tecnica-BackEnd.jar app.jar
    ENTRYPOINT ["java","-jar","app.jar"]  
    
4.- Creacion de imagen del BackEnd con el siguiente comando:  
  
    `docker build -t springboot-mongodg:1.0`  
    
5.- Levantar contenedor del back:  

    `docker run -p 8080:8080 --name prueba-springboot-docker -d springboot-mongodg:1.0`  
    
 ![Docker SpringBoot](https://raw.githubusercontent.com/DeveloperCarJe/PruebaGizloFullStack/master/Capturas/SpringBoot.PNG)
