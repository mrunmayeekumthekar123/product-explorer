# 🛒 E-Commerce Product Explorer

A full-stack web application that allows users to explore, search, sort, and paginate through products using a **Spring Boot REST API** with a **lightweight HTML/JavaScript frontend**.

---

## 🚀 Features

### 🔧 Backend (Java + Spring Boot)
- RESTful API built using **Spring Boot**
- CRUD support for products
- Pagination support (`page`, `size`)
- Sorting by:
  - Price
  - Rating
- Search products by name
- Uses **Spring Data JPA** with **H2 in-memory database**
- Clean layered architecture:
  - Controller
  - Service
  - Repository
  - Model

### 🎨 Frontend (HTML + JavaScript)
- Simple, responsive UI
- Fetches product data from backend APIs
- Features:
  - Product listing
  - Sorting dropdown
  - Pagination (Next / Previous buttons)
- Frontend served directly by Spring Boot

---

## 🧱 Tech Stack

| Layer      | Technology |
|------------|-----------|
| Backend    | Java, Spring Boot |
| Database   | H2 (In-memory) |
| ORM        | Spring Data JPA |
| Frontend   | HTML, CSS, JavaScript |
| Build Tool | Maven |
| IDE        | IntelliJ IDEA / VS Code |

---

## ▶️ How to Run the Project

### Prerequisites
- Java 17+
- Maven
- IntelliJ IDEA or VS Code

### Steps
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/product-explorer.git
2. Open the project in your IDE
3. Run: ProductExplorerApplication.java
4. Open browser: http://localhost:8080


   ## API Endpoints

### Get products
GET /api/products
Query Parameters:

page (default: 0)

size (default: 5)

sort (price | rating)

search (optional)

Example: http://localhost:8080/api/products?page=0&size=5&sort=price&search=phone

### Add Products
POST /api/products

Request Body(JSON):
{
  "name": "Smartphone",
  "brand": "Samsung",
  "category": "Electronics",
  "price": 29999,
  "rating": 4.5,
  "inStock": true
}


## Database Access (H2 Console)
http://localhost:8080/h2-console

JDBC URL: jdbc:h2:mem:testdb



## Future Improvements:
1. User authentication (JWT)
2. Product update & delete from UI
3. Category-based filtering
4. Deploy backend + frontend
5. Switch to MySQL/PostgreSQL
