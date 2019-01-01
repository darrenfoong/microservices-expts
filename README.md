# Microservice Experiments

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
Gateway: http://localhost:8400/api/hello/hello/
