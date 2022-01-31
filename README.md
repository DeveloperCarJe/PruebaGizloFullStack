# Backend Usuarios.
# Resumen
 * El BackEnd es realizada en la plataforma de SPRING TOOLS SUITE4, que es un ambiente para Eclipse. En la que se desarrollo un micorservicio para Almacenar, Actualizar, Eliminar y Listar usuarios de una BD.  

* La BD utilizada para el almacenamiento de informacion es MongoDB, es una BD NOSQL en las que no ayuda flexibilidad al momento de la creacion de Schema.  

* El Back y la BD estan contenerizado y ejecutandose por debajo. En las que nos ayudara a ahorrar muchos recursos.  

# Orquestacion del MongoDB
Para la orquestacion de la BD se utilizaron los siguientes comandos desde la consola:

1.- Instalacion del MongoDB y creacion de imagen  
 `docker pull mongo:latest`
 
2.- Levantar BD  
`docker run -d -p 27017:27017 --name gizlomongodb mongo:latest`
