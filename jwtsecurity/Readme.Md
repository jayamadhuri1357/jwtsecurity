# 🔐 JWT Security Spring Boot Project

## 📌 Project Overview
This project is a Spring Boot application implementing JWT-based authentication and authorization. It allows users to register, login, and access secured REST APIs using JSON Web Tokens.

The system uses Spring Security + JWT + H2 Database to demonstrate stateless authentication.

---

## ⚙️ Tech Stack
- Java 17+
- Spring Boot
- Spring Security
- JWT (JSON Web Token)
- Spring Data JPA
- H2 Database (In-memory)
- Maven

---

## 🚀 Features
- User Registration API
- User Login API with JWT token generation
- Secured REST endpoints
- Role-based authorization (USER role)
- JWT Authentication Filter
- Password encryption using BCrypt
- Stateless session management
- In-memory H2 database

---

## 📡 API Endpoints

### 1. Register User
POST http://localhost:8080/auth/register

Request Body:
{
  "username": "jaya",
  "password": "1234",
  "role": "USER"
}

Response:
User registered successfully

---

### 2. Login User
POST http://localhost:8080/auth/login

Request Body:
{
  "username": "jaya",
  "password": "1234"
}

Response:
JWT Token (string)

---

### 3. Protected API
GET http://localhost:8080/user/home

Headers:
Authorization: Bearer <JWT_TOKEN>

Response:
Welcome User!

---

## 🗄️ H2 Database Console
http://localhost:8080/h2-console

Login Details:
JDBC URL: jdbc:h2:mem:testdb
Username: sa
Password: (leave empty)

---

## ▶️ How to Run the Project

Step 1: Clone Repository
git clone <your-repo-url>

Step 2: Navigate to Project
cd jwtsecurity

Step 3: Run Application
mvn spring-boot:run

---

## 🔐 JWT Authentication Flow
User registers using /auth/register  
User logs in using /auth/login  
Server generates JWT token  
Token is sent in Authorization header  
Spring Security filter validates token  
Access granted to secured APIs  

---

## 📁 Project Structure
jwtsecurity
 ├── config
 │    ├── JwtAuthFilter
 │    ├── JwtUtil
 │    ├── SecurityConfig
 ├── controller
 │    ├── AuthController
 │    ├── UserController
 ├── entity
 │    ├── User
 ├── service
 │    ├── UserService
 │    ├── UserDetailsServiceImpl
 ├── repository
 │    ├── UserRepository
 ├── dto
 │    ├── LoginRequest
 │    ├── RegisterRequest
 ├── JwtsecurityApplication.java
 ├── pom.xml

---

## 👨‍💻 Author
Jaya Madhuri

---

## 📌 Note
This project uses stateless JWT authentication  
H2 database resets on every restart  
All secured endpoints require valid JWT token
