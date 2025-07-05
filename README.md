# CarDataRestApI

This is a simple Spring Boot REST API for managing car data, including features like adding a car, updating its price, and retrieving car details.

---
## 📦 Features

- Add new car details
- Update car price by `carId`
- Fetch all cars
- Delete car

---

## 🛠 Technologies Used

- Java 17+
- Spring Boot
- Spring Data JPA
- H2 / MySQL (can be configured)
- Maven
- Postman (for API testing)

---

## 🚀 API Endpoints
## ➕ Add New Car
## POST http://localhost:8085/carData/add-cardata
## RequestBody
{ <br>
  "carName": "Virtus Gt", <br>
  "brand": "Volkswagen", <br>
  "fuelCapacity": 5, <br>
  "price": 2500000, <br>
  "seatCapacity": 5, <br>
  "carType": "Sedan" <br>
}

---

## 🔁 Update Car Price
## PUT http://localhost:8085/carData/update-cardata
{ <br>
  "carId": 1, <br>
  "price": 2750000 <br>
}

---
## ⚙️ Configuration - application.properties
## Use H2 in-memory database
spring.datasource.url=jdbc:h2:mem:testdb <br>
spring.datasource.driverClassName=org.h2.Driver <br>
spring.datasource.username=sa <br>
spring.datasource.password= <br>
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect <br>
spring.h2.console.enabled=true <br>
spring.jpa.show-sql=true <br>
spring.jpa.hibernate.ddl-auto=update <br>

---
## 🧪 Testing the API
  - Use Postman or similar tools.
  - Ensure the server is running on http://localhost:8085
  - Set Content-Type: application/json for all requests

---


