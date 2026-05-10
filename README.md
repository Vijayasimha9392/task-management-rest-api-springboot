#Task Management REST API

A RESTful API built using Java and Spring Boot for managing tasks.

## Features
- Create a task
- Get all tasks
- Get task by ID
- Update task
- Delete task
- Mark task as completed
- Basic authentication
- Input validation
- Exception handling
- Unit testing

## Tech Stack
- Java 17
- Spring Boot 3.3.0
- Spring Web
- Spring Security
- Spring Validation
- Maven
- In-memory storage (HashMap)

## Project Structure
src/main/java/com/example
 ├── controllers
 ├── service
 ├── serviceImpl
 ├── dao
 ├── daoImpl
 ├── models
 ├── exception
 ├── config
 └── TaskManagementApiApplication.java

## How to Run:
### Clone repository
git clone <your-github-link>

### Open in STS
Import as Maven Project

### Run application
Run:
TaskManagementApiApplication.java
Application starts at:
http://localhost:8080

## Authentication
Basic Auth credentials:
Username: admin
Password: admin123

## API Endpoints:

### Get all tasks
GET /tasks

### Get task by ID
GET /tasks/{id}

### Create task
POST /tasks

Sample body:
json:
{
  "title": "Learn Spring Boot",
  "description": "Task API project",
  "dueDate": "2026-05-15"
}

### Update task
PUT /tasks/{id}

### Delete task
DELETE /tasks/{id}

### Mark complete
PATCH /tasks/{id}/complete

## Testing in Postman
1. Open Postman
2. Add Basic Auth
3. Use above endpoints
4. Send JSON body for POST/PUT
