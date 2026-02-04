**Event Management System – Spring Boot REST API**
**Project Overview**

The Event Management System is a Spring Boot based RESTful web application that allows users to create, view, update, and delete events.
It demonstrates a clean layered architecture using Controller, Service, Repository, and Model layers along with an in-memory H2 database and Swagger UI for API documentation.

This project is beginner-friendly and can be used as a reference for learning:

Spring Boot REST APIs
JPA & Hibernate
H2 Database
Swagger API Documentation
Maven Build Tool

**Features**

Create Event
Get All Events
Get Event by ID
Update Event
Delete Event
Input Validation
Swagger UI Documentation
H2 In-Memory Database Console

**Tech Stack**

Java 17
Spring Boot 3.2.2
Spring Web
Spring Data JPA
H2 Database
Maven
Swagger (Springdoc OpenAPI)

**Project Structure**
```
src/main/java/com/example/eventmanagement
│
├── controller      → REST Controllers
├── service         → Business Logic
├── repository      → JPA Repositories
├── model           → Entity Classes
├── exception       → Custom Exceptions (optional)
└── EventmanagementApplication.java
```

**Application URLs**
```
| Purpose          | URL                                                                            |
| ---------------- | ------------------------------------------------------------------------------ |
| Application Base | [http://localhost:8080](http://localhost:8080)                                 |
| Swagger UI       | [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html) |
| H2 Console       | [http://localhost:8080/h2-console](http://localhost:8080/h2-console)           |
```
```
**H2 Database Login**

JDBC URL: jdbc:h2:mem:eventdb
Username: sa
Password: (leave empty)

**Example Table**
SHOW TABLES;
Output:
EVENT
SELECT * FROM EVENT;

Create Event:
POST /api/events
EX: 
{
  "name": "Tech Conference",
  "location": "Hyderabad",
  "date": "2026-03-10",
  "description": "Spring Boot Event"
}

1.Get All Events
GET /api/events
2.Get Event by ID
GET /api/events/{id}
3.Update Event
PUT /api/events/{id}
4.Delete Event
DELETE /api/events/{id}

**Architecture Used**

Controller Layer → Handles HTTP Requests & Responses
Service Layer → Business Logic
Repository Layer → Database Operations
Model Layer → Entity Mapping

**Testing**
Unit testing can be implemented using:
JUnit
Mockito
Dependencies already included.
```

