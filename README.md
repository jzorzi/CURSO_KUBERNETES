---- README.md ----



echo "# CURSO_KUBERNETES" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin git@github.com:jzorzi/CURSO_KUBERNETES.git
git push -u origin main


------- POSTGRES -------

 2096  sudo -u postgres psql
 2100  psql -h localhost -u jzorzi 5432
 2101  psql -h localhost -U jzorzi 5432
 2109  sudo -u postgres psql 
 2111  psql -U jzorzi
 2112  psql -U msvc_cursos
 2113  psql -U postgres
 2114  history | grep psql


-- entrar en la base de datos
 psql -h localhost -U jzorzi msvc_cursos
SELECT current_database();

-- lista bases de datos
/l                        
-- List tables in current schema
\dt

-- List tables in a specific schema
\dt schema_name.*

-- List tables matching a pattern
\dt *users*

-- List tables with additional d    {
        "email": "modificar_zorzi@hotmail.com",
        "id": 6,
        "nombre": "modificar",
        "password": ""
    }etails (size, description)
\dt+


------- maven / java / dockerisar la app --------
mvn clean package                       // (en la carpeta target se crea el snapshot jar)
mvn clean package -DskipTests           // cuando cambiamos conf. bd a otro server y no el container, 
                                        // ... esto pq las test apuntan a otro servidor y no al de la imagen

// java -jar java -jar msvc-usuarios/target/msvc-usuarios-0.0.1-SNAPSHOT.jar (para ejecutar la appx)

docker build .                          // crear la imagen (pararse donde esta el Dockerfile)
docker rmi -f <imageId>                 // fuerza borrar imagen 


docker stop <imagenId>
docker run <imagenId>                   // no especificamos los puertos
docker run -p 8001:8001 <imagenId>      // especificamos puerto interior/exterior
docker run -p 8001:8001 a0d8cd111ede

docker context ls                       // lista docker engines en linux
docker context use <desktop-engine>     // usar un engine determinado
docker image rm <imageId>               // remueve imagen
docker image rm -f <imageId>            // remueve imagen (force)

docker images 
docker image ls
docker images -a                        // lista todas las imagenes
docker image ls -a --format table       // lista todas las imagenes y su columna "CREATED"

- run msvc-usuarios
mvn clean package -DskipTests  
docker build -t usuarios_imagen .
docker image ls -a --format table
docker run -p 8001:8001 usuarios_imagen

- run msvc-cursos
mvn clean package -DskipTests  
docker build -t cursos_imagen .
docker image ls -a --format table
docker run -p 8002:8002 cursos_imagen

