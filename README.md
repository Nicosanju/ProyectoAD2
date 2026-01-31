# Spotify

## Índice
- [Introducción](#introducción)
- [Manual técnico para desarrolladores](#manual-técnico-para-desarrolladores)
  - [Requisitos previos](#requisitos-previos)
  - [Base de Datos. Modelo Entidad-Relación](#base-de-datos-modelo-entidad-relación)
    - [Tabla Artistas](#tabla-artistas)
    - [Tabla Canción](#tabla-canción)
    - [Tabla Álbum](#tabla-álbum)
    - [Tabla Género](#tabla-género)
    - [Tabla Usuario](#tabla-usuario)
  - [Estructura](#estructura)
  - [Metodología](#metodología)
  - [Configuracion de Ant](#configuración-de-ant)
  - [Ejecución del proyecto](#ejecución-del-proyecto)
  - [Manejo de errores](#manejo-de-errores)
- [Manual de usuario](#manual-de-usuario)
  - [Registro](#registro)
  - [Busquedas](#busquedas)
  - [Otras opciones (Borrar y añadir canción)](#otras-opciones-borrar-y-añadir-canción)
- [Reparto de tareas](#reparto-de-tareas)
- [Mejoras](#mejoras)
- [Conclusiones](#conclusiones)
- [Autores](#autores)

## Introducción
Este proyecto tratará sobre una aplicación donde intentaremos recrear(en la medida de lo posible) lo que es spotify hoy en día.
Con ello n
    

[Volver al índice](#índice)
## Manual técnico para desarrolladores
### Requisitos previos
- **Java SE 17 o superior:** El proyecto se ha desarrollado usando la version 17 de Java, lo cual se requiere usar la misma version o superior
- **Maven:** La gestión de las dependencias se hace con Maven, lo cual se deberá tener Maven instalado.
- **IDE Recomendado:** Para este proyecto se ha usado Apache NetBeans como IDE pero se puede usar cualquiera que soporte el lenguaje de Java.
- **MySQL:** El proyecto utiliza MySQL como sistema de gestión de bases de datos, por lo que deberás instalarlo. (descargar)

### Base de Datos. Modelo Entidad-Relación

#### Tabla Artistas
| Campo          | Tipo de dato | Descripción                                   |
|----------------|--------------|-----------------------------------------------|             
| ID             | INT (PK)     | Identificador único del artista               |
| Nombre         | VARCHAR(20)  | Nombre del artista                            |
| Reproducciones | DOUBLE       | Reproducciones mensuales del artista          |
| Cancion        | INT          | Nombre de la canción                          |
| Album          | VARCHAR(80)  | Nombre del álbum al cual pertenece la canción |
| Genero         | VARCHAR(20)  | Género de música del artista                  |
| Nacionalidad   | VARCHAR(20)  | País de origen                                |
| Imagen         | VARCHAR(200) | Imagen del artista                            |
#### Tabla Canción
| Campo          | Tipo de dato | Descripción                          |
|----------------|--------------|--------------------------------------|
| ID             | INT (PK)     | Identificador único del artista      |
| Nombre         | VARCHAR(130) | Nombre de la canción                 |
| Reproducciones | DOUBLE       | Total de reproducciones de la canción|
| Album          | VARCHAR(80)  | Nombre del álbum                     |
| Genero         | VARCHAR(20)  | Género de música de la canción       |
| Artistas       | VARCHAR(130) | Artistas que participan en la canción|
| Imagen         | VARCHAR(200) | Imagen de la canción                 |
| Duración       | INT          | Duración total de la  canción        |
#### Tabla Álbum
| Campo             | Tipo de dato  | Descripción                        |
|----------------   |-------------- |---------------------------------   |
| ID                | INT (PK)      | Identificador único del artista    |
| Nombre            | VARCHAR(80)   | Nombre del álbum                   |
| Reproducciones    | DOUBLE        | Total de reproducciones del álbum  |
| Canciones         | VARCHAR(2000) | Canciones que componen el álbum    |
| Artistas          | VARCHAR(130)  | Artistas que participan en el álbum|
| Genero            | VARCHAR(20)   | Género de música del album         |
| Cantidad_Canciones| INT           | Cantidad de canciones del álbum    |
| Imagen            | VARCHAR(200)  | Imagen del álbum                   |
| Duración          | INT           | Duración total del álbum           |
#### Tabla Género

| Campo  | Tipo de dato | Descripción                                      |
|------- |--------------|--------------------------------------------------|
| ID     | INT (PK)     | Identificador único del género musical           |
| Nombre | VARCHAR(20)  | Nombre del género musical                        |

#### Tabla Usuario
| Campo          | Tipo de dato | Descripción                     |
|----------------|--------------|---------------------------------|
| ID             | INT (PK)     | Identificador único del artista |
| Nombre         | VARCHAR(50) | Nombre de usuario               |
| Contraseña     | VARCHAR(30)  | Contraseña del usuario          |
| masReproducido | VARCHAR(30)  | Artista favorito                |


### Estructura
El proyecto está planteado segun la estructura Modelo, Vista, Controlador.

#### Modelo

#### Vista

#### Controlador

### Metodología

#### Uso de Git

El proyecto utiliza la metodología de desarrollo incremental basado en ramas, lo cual da una gran acilidad a la hora de la gestión de versiones y el trabajo en equipo de todos los desarrolladores.
Las rama base en este caso sería 'main' y las ramas que se utilizaron para el desarrollo fueron 2 con los nombres de los desarrolladores en este caso 'Nico' y 'Iago' donde cada uno trabajaba en ella independientemente.

Flujo de trabajo:

1. **Añadir funcionalidad:** cuando se quiere crear una nueva funcionalidad, se avisa al equipo y se trabaja en la propia rama para implementarla sabiendo de antemano que no va a pisar nada de lo que otro desarrollador este trabajando en otra rama.
2. **Testear:** Cuando se completa la nueva funcionalidad se realizan las pruebas pertinentes para asegurar que funciona correctamente y no rompe nada del resto del proyecto.
3. **Merge a Developer:** Al haber testeado las nuevas funcionalidades y ser exitosas, se realiza un mergeo de la rama a developer. Es importante este paso dado que todo lo que vaya a esta rama debera de ir  con los menos problemas posibles a la hora de mergear con el resto de desarrolladores.
4. **Merge a Main:** Para finalizar cuando la rama `developer` fue probada y es una version estable y sin errores, se realiza el merge a la rama `main`. Al tener todo el proyecto actualizado en el main dariamos paso a una nueva version del proyecto final.

Gracias a este flujo de trabajo nos permite trabajar varios desarrolladores simultaneamente cada 1 con funciones diferentes y poder integrar todos los cambios a la vez, testeandolo todo al mismo tiempo y corregir errores que puedan salir al mergear.


### Configuración de Ant
  
  **mysql-connector-j-8.1.0.jar:**:Se utiliza para poder conectarse  así a la base de datos que   tengamos creada.
  Para poder añadirlo correctamente tendríamos que seguir estos pasos:
    1.Abrir el proyecto
    2.Hacer click derecho en "Libraries"
    3.Darle a ADD JAR/Folder 
    4.Seleccionar el conector en cuestión

### Ejecución del proyecto

### Manejo de errores
Para este proyecto hemos usado los try catch para controlar las posibles excepciones que puedan salir en el manejo de la aplicación.
## Manual de usuario
[Volver al índice](#índice)
### Registro
Al abrir la aplicación, el usuario en cuestión verá la siguiente pantalla :
### Busquedas

### Otras opciones (Borrar y añadir canción)

## Reparto de tareas
[Volver al índice](#índice)
## Mejoras
[Volver al índice](#índice)
## Conclusiones
[Volver al índice](#índice)
## Autores
