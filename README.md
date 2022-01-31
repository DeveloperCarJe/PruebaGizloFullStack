# FrontEnd Usuarios.
# Resumen
 * El FrontEnd se realizo en la plataforma de VISUAL STUDIO CODE y se utilizo el Framework Angular para el desarrollo de la aplicacion Web, que asu vez se conectara mediante WebServices al BackEnd que fue desarrollado en SPRINGBOOT.  

* El FrontEnd esta levantado en un contenedor el cual se despliega en el navegador con el siguiente url: http://localhost:8083/api/v1/usuarios, en las que graficamente podemos realizar los CRUD y consumir el WebService del BackEnd.  

* En el FrontEnd Automaticamente cuando se inicie observaremos todos los usuarios que estan registrado, a su vez tenemos un Formulario en la que nos permitira ingresar, actualizar y eliminar usuarios de la BD.  

# Levantamiento del proyecto  

Almento que el proyecto es descargado para posibles actualizaciones o el uso de aprendizaje, se debe ejecutar desde el terminar el siguiente comando:  

  npm install  
  
# Orquestacion y Generar Build del proyecto  

1.- Desde el terminal se debe ejecutar el siguiente comando para generar el Build(/dist)  

    ng build --prod  
    
2.- Archivo DockerFile  

    FROM nginx:1.17.1-alpine
    COPY /dist/front-end-angular-gizlo /usr/share/nginx/html  

3.- Ejecutar desde la terminal la creacion de la imagen:  

    docker build -t angularapp .  
    
4.- Leventar el contenedor:  

    docker run -p 8083:80 --name prueba-angular-docker -d angularapp  
    
![Docker Angular](https://raw.githubusercontent.com/DeveloperCarJe/PruebaGizloFullStack/master/Capturas/Angular.PNG)
