# Product Service - Spring Boot Microservice

A simple RESTful microservice built with Spring Boot for managing products.

## Technologies Used

- Spring Boot 3.2.0
- Spring Web
- Spring Data JPA
- H2 In-Memory Database
- Springdoc OpenAPI (Swagger)
- Maven
- Java 17

## Features

- Create, Read, Update, and Delete products
- In-memory H2 database
- REST API documentation with Swagger UI
- Simple and clean architecture

## How to Run

1. **Clone the repository:**
   ```bash
   git clone https://github.com/hiranoshadha/CTSE-DevOps-Lab-3-IT22630384-.git
   cd product-service
   ```

2. **Build the project:**
   ```bash
   mvn clean install
   ```

3. **Run the application:**
   ```bash
   mvn spring-boot:run
   ```

4. **The application will start on:** `http://localhost:8080`

## Access Points

- **Swagger UI:** http://localhost:8080/swagger-ui.html
- **H2 Console:** http://localhost:8080/h2-console
- **API Base URL:** http://localhost:8080/api/products

## H2 Database Configuration

- **JDBC URL:** `jdbc:h2:mem:productdb`
- **Username:** `sa`
- **Password:** (leave empty)

## API Endpoints

### 1. Create a Product
```
POST http://localhost:8080/api/products
Content-Type: application/json

{
  "name": "Laptop",
  "price": 75000.00
}
```

### 2. Get All Products
```
GET http://localhost:8080/api/products
```

### 3. Get Product by ID
```
GET http://localhost:8080/api/products/{id}
```

### 4. Update a Product
```
PUT http://localhost:8080/api/products/{id}
Content-Type: application/json

{
  "name": "Gaming Laptop",
  "price": 125000.00
}
```

### 5. Delete a Product
```
DELETE http://localhost:8080/api/products/{id}
```

## Project Structure

```
product-service/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/sliit/productservice/
│   │   │       ├── ProductServiceApplication.java
│   │   │       ├── controller/
│   │   │       │   └── ProductController.java
│   │   │       ├── entity/
│   │   │       │   └── Product.java
│   │   │       └── repository/
│   │   │           └── ProductRepository.java
│   │   └── resources/
│   │       └── application.properties
└── pom.xml
```

## Testing with Swagger

1. Navigate to http://localhost:8080/swagger-ui.html
2. Test all endpoints directly from the Swagger interface
3. View request/response schemas

## Author

**Student ID:** IT22630384  
**Module:** Current Trends in Software Engineering (SE4010)  
**Lab:** DevOps Lab 3  
**Institution:** SLIIT
