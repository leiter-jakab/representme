# Represent Me

The application is a single [Spring MVC](https://spring.io/projects/spring-framework) instance implemented using [Spring Boot](https://spring.io/projects/spring-boot).

## Requirements

* Project is currently set up for Windows dev environment with [WSL2](https://docs.microsoft.com/en-us/windows/wsl/) and requires
  * [Docker Desktop](https://www.docker.com/products/docker-desktop/)
  * [Java 17](https://www.azul.com/downloads/?version=java-17-lts&os=ubuntu&package=jdk)

## Dev Env

### Dev Database

The dev Database is running in a Docker container and persists its data in a Docker volume.

* container name: representme-db
* volume name: representme-postgres
* users:
  * superadmin:
    * username: postgres
    * password: dev
  * schema admin:
    * username: schema_admin
      * password: dev
  * schema user:
    * username: schema_user
    * password: dev

#### Setup

* Start the DB container (will create Docker volume and the logical DB): `./gradlew dbStart`
* Initialize the DB schema (creating schema and users): `./gradlew initSchema`
* Run the migrations including the inserts of test-data: `./gradlew devMigrate`

To reset the DB you can run the setup tasks after running the following tasks:
* `./gradlew dbStop`
* `./gradlew dbVolumeDelete`

### Dev Application

Start your local dev instance with `./gradlew bootRun`. The app will be available under the url `http://localhost:8080`.
