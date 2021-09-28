[![ci-build](https://github.com/to4kin/dev-school-app/actions/workflows/ci-build.yml/badge.svg?branch=master)](https://github.com/to4kin/dev-school-app/actions/workflows/ci-build.yml)
[![GitHub release](https://img.shields.io/github/release/to4kin/dev-school-app.svg)](https://GitHub.com/to4kin/dev-school-app/releases/)

# dev-school-app

## Installation
### Precondition
List of required tools:
<ul>
    <li>PostgreSQL 13</li>
    <li>Gradle v6.6.1 or gradlew</li>
    <li>Java 8</li>
</ul>

### Build

Use gradle inside root folder for app build.

```bash
gradlew build
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

By default deployable JAR file can be found in
```bash
\dev-school-app\build\libs
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