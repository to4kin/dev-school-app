[![ci-build](https://github.com/to4kin/dev-school-app/actions/workflows/ci-build.yml/badge.svg?branch=master)](https://github.com/to4kin/dev-school-app/actions/workflows/ci-build.yml)
[![GitHub release](https://img.shields.io/github/release/to4kin/dev-school-app.svg)](https://GitHub.com/to4kin/dev-school-app/releases/)
[![codecov](https://codecov.io/gh/to4kin/dev-school-app/branch/master/graph/badge.svg?token=HP43OLNAVJ)](https://codecov.io/gh/to4kin/dev-school-app)

# dev-school-app

## Installation
### Precondition
List of required tools:

* PostgreSQL 13
* Gradle v6.6.1 or gradlew
* Java 8

### Build

Use gradle inside root folder for app build.

```bash
gradlew build
```

### Publish

JIB plugin was added to the project, so you can push docker image to the docker regisrty:

```bash
gradlew build jib
```

For this command the following properties are required:

gradle.properties:
```bash
dockerRegistry = <docker-registry-url>
dockerUsername = <docker-username>
dockerPassword = <docker-password>
```

or via environment variables:
```bash
ORG_GRADLE_PROJECT_dockerRegistry=<docker-registry-url>
ORG_GRADLE_PROJECT_dockerUsername=<docker-username> 
ORG_GRADLE_PROJECT_dockerPassword=<docker-password> 
```

## Deploy

PostgreSQL database should be installed and deployed.<br>
Database connection should be configured inside application.yaml:
```yaml
spring:
  datasource:
    url: <connection url>
    driverClassName: org.postgresql.Driver
    username: <database user name>
    password: <database password>
```

You can also override the default configuration via environment variables:
```bash
DATASOURCE_URL=<connection url>
DATASOURCE_USERNAME=<database user name>
DATASOURCE_PASSWORD=<database password>
```

By default deployable JAR file can be found in
```bash
build/libs
```

Simple deploy can be done by java jar command.
```bash
java -jar dev-school-app-1.0-SNAPSHOT.jar
```

Useful links
```bash
Swagger API: http://localhost:8080/swagger-ui.html
Swagger DOCS: https://swagger.io/docs/
```