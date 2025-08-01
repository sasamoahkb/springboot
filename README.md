# Spring Boot RESTful CRUD API

This was a tutorial attempt following Amigoscode on youtube to build a RESTful CRUD API
for a simple product domain mainly via Spring Boot (M1 version (~3.8x)  and Java 21 LTS.

The purpose of the application is to provide a web service that manages product resources  
via thoughtful GET and POST methods running through API endpoints.

  
Suitable starting template for Java microservices or API servers  
  
## Software and Tools Required:
- Java 21 (LTS) JDK  
- Spring Initializr: - Maven
- Spring Boot extension pack in VScode extension store 
- Intellij or VScode IDE: - I used VScode for this project but my source used Intellij
- Dependencies:
  - spring-boot-starter-web
  - spring-boot-starter-data-jpa
  - spring-boot-devtools
  - Database driver (PostgreSQL)
  - Docker & Docker Compose .yaml file
 
  Docker handles the pulling of the Postgres image so no need to install Postgres
 
## How To Run:  
1. Generate project via Spring Initializr with required dependencies
2. Import into your preferred IDE  
3. Configure `application.properties` (e.g. database URL, credentials)  
4. Build and run:  
./mvn spring-boot:run   or  
java -jar target/your-app.jar  or  
you can press the play button in the Springboot Dashboard extension    
6. Test endpoints -
  I would send valid JSON payload to POST /products which returns 201 CREATED; 400 means BAD REQUEST.
  GET endpoints return links in JSON



## Future considerations:
Pagination for listing resources (especially if data set grows)

Business logic layer (service layer) to decouple data and control flow

Date handling and standardization (e.g. ISO 8601 timestamps)

Security integration using Spring Security for authentication/authorization

Actuator & Observability setup: metrics endpoints, health checks, distributed tracing






