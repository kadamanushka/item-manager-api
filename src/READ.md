# Item Manager API

## How to Run
1. Install Java 17 and Maven
2. Run:
   mvn spring-boot:run
3. App runs at:
   http://localhost:8081

## API Endpoints

### Add Item
POST /api/items
Body:
{
  "name": "Pen",
  "description": "Blue ink pen",
  "price": 10
}

### Get Item by ID
GET /api/items/{id}

## Storage
In-memory using ArrayList.

## Validation
- Name and description required
- Price must be positive
