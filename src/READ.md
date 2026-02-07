# Item Manager REST API

## Description
This is a Spring Boot REST API project that manages items using in-memory storage (ArrayList).
It supports basic CRUD-style operations without using a database.

---

## Technologies Used
- Java 17
- Spring Boot
- Maven
- Postman

---

## Server Port
8081

---

## How To Run
1. Open the project in VS Code
2. Open Terminal
3. Run:
   mvn spring-boot:run
4. The server will start at:
   http://localhost:8081

---

## API Endpoints

### 1. Add Item
**POST** `/api/items`

#### Request Body
```json
{
    "id":"4",
  "name": "Mobile",
  "description": "Samsung Phone",
  "price": 15000
}

