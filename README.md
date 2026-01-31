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
  - [Configuracion de Maven](#configuración-de-maven)
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

### Configuración de Maven

### Ejecución del proyecto

### Manejo de errores

## Manual de usuario
[Volver al índice](#índice)
### Registro

### Busquedas

### Otras opciones (Borrar y añadir canción)

## Reparto de tareas
[Volver al índice](#índice)
## Mejoras
[Volver al índice](#índice)
## Conclusiones
[Volver al índice](#índice)
## Autores
