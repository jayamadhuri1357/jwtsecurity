🔐 JWT Security Spring Boot Project
📌 Project Overview

This project demonstrates JWT (JSON Web Token) based authentication and authorization using Spring Boot. It includes user registration, login, and access to protected REST APIs with role-based security.

⚙️ Tech Stack
Java 17+
Spring Boot
Spring Security
JWT (JSON Web Token)
Spring Data JPA
H2 Database
Maven
🚀 Features
User Registration API
User Login API (JWT Token generation)
Secure REST endpoints using JWT
Role-based access control (USER role)
Spring Security filter (JWT validation)
Stateless authentication
In-memory H2 database
📡 API Endpoints
🔹 1. Register User

URL:

POST http://localhost:8080/auth/register

Request Body:

{
  "username": "jaya",
  "password": "1234",
  "role": "USER"
}

Response:

User registered successfully
🔹 2. Login User

URL:

POST http://localhost:8080/auth/login

Request Body:

{
  "username": "jaya",
  "password": "1234"
}

Response:

JWT Token (string)
🔹 3. Protected API

URL:

GET http://localhost:8080/user/home

Headers:

Authorization: Bearer <JWT_TOKEN>

Response:

Welcome User!
🗄️ H2 Database Console

Access H2 database:

http://localhost:8080/h2-console
Login Details:
JDBC URL: jdbc:h2:mem:testdb
Username: sa
Password: (leave empty)
▶️ How to Run the Project
Step 1: Clone the repository
git clone <your-repo-url>
Step 2: Navigate to project folder
cd jwtsecurity
Step 3: Run the application
mvn spring-boot:run
🔐 Security Flow
Register user → stores data in DB
Login user → generates JWT token
Token is sent in Authorization header
Filter validates token
Access granted to protected endpoints
 Note
This project uses stateless authentication
All secure APIs require JWT token
H2 database resets on every restart