# Microservice Experiments

Download and setup Keycloak: https://www.baeldung.com/spring-boot-keycloak

Go to http://localhost:8080/auth

```
Realm: ExptsKeycloak
  Valid Redirect URIs: http://localhost:8400/*
Resource: gateway
Roles: [user]
```

```
gradle build
gradle :config-server:bootRun
gradle :naming-server:bootRun
gradle :gateway:bootRun
SERVER_PORT=8421 gradle :translate-service:bootRun
SERVER_PORT=8422 gradle :translate-service:bootRun
gradle :hello-service:bootRun
```

Eureka: http://localhost:8761/

Gateway: http://localhost:8400/hello/hello/
