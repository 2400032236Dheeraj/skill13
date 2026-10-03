# Student API

Spring Boot CRUD API for students with Swagger UI (springdoc-openapi) and an in-memory H2 database.

## Run

```bash
./mvnw spring-boot:run        # Windows: mvnw.cmd spring-boot:run
```

- Swagger UI: http://localhost:8080/swagger-ui.html
- OpenAPI JSON: http://localhost:8080/v3/api-docs
- H2 console: http://localhost:8080/h2-console (JDBC URL `jdbc:h2:mem:studentdb`, user `sa`)

Requires Java 17+.
