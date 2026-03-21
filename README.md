# 🚀 Scalable IoT Data Monitoring System (Spring Boot Microservices)

## 📌 Overview

This project is a **production-style backend system** designed to ingest, process, and store high-frequency IoT sensor data using a **Spring Boot-based microservices architecture**.

It simulates a real-world IoT pipeline where data is continuously generated and must be processed reliably, securely, and at scale.

---

## 🧠 Problem Statement

Modern IoT systems generate massive volumes of sensor data that must be:

* processed in real-time
* handled with low latency
* stored efficiently for analytics

This project demonstrates how a **scalable microservices backend** can handle such workloads using asynchronous processing and modular service design.

---

## 🏗️ Architecture

```
Client → API Gateway → Ingestion Service → Processing Service → Storage Service → MySQL
```

### 🔹 Microservices Breakdown

* **Ingestion Service**

  * Accepts incoming sensor data via REST APIs
* **Processing Service**

  * Validates, filters, and processes incoming data
* **Storage Service**

  * Persists processed data into MySQL database

---

## ⚡ Performance & Scalability

* Designed to handle **1000+ simulated sensor requests**
* Implemented **asynchronous processing** to reduce API latency
* Modular microservices architecture improves **scalability and maintainability**
* Efficient database interaction using **JPA/Hibernate ORM**

---

## 🔐 Security

* Implemented **JWT-based authentication**
* Secured REST endpoints with token validation
* Supports role-based access for protected APIs

---

## 🧩 Spring Boot Implementation

* Built using **Spring Boot with layered architecture**

  * Controller → Service → Repository
* Developed RESTful APIs with structured request/response handling
* Used **Spring Data JPA** for database operations
* Configured application properties for environment-based setup

---

## 💻 Sample API Implementation

```java
@RestController
@RequestMapping("/api/sensor-data")
public class SensorController {

    @PostMapping
    public ResponseEntity<?> ingestData(@RequestBody SensorData data) {
        return ResponseEntity.ok(sensorService.processData(data));
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getData(@PathVariable Long id) {
        return ResponseEntity.ok(sensorService.getDataById(id));
    }
}
```

---

## ⚙️ Tech Stack

| Category     | Technology         |
| ------------ | ------------------ |
| Backend      | Java, Spring Boot  |
| Architecture | Microservices      |
| Database     | MySQL              |
| ORM          | JPA / Hibernate    |
| Security     | JWT Authentication |
| API          | REST APIs          |
| Build Tool   | Maven              |

---

## 📂 Project Structure

```
src/
 ├── controller/     # REST API endpoints
 ├── service/        # Business logic
 ├── repository/     # Database access layer
 ├── entity/         # JPA entities
 ├── config/         # Security & app configuration
```

---

## 📡 API Endpoints

| Method | Endpoint              | Description             |
| ------ | --------------------- | ----------------------- |
| POST   | /api/sensor-data      | Submit sensor data      |
| GET    | /api/sensor-data/{id} | Fetch sensor data by ID |

---

## ▶️ How to Run

```bash
# Clone the repository
git clone https://github.com/jancysen/iot-microservices-system.git

# Navigate to the project directory
cd iot-microservices-system

# Run the application
mvn spring-boot:run
```

---

## 🚀 Future Improvements

* Add **API Gateway (Spring Cloud Gateway)**
* Implement **Service Discovery (Eureka)**
* Integrate **Kafka/RabbitMQ for event-driven processing**
* Add **Docker containerization**
* Deploy on cloud (AWS/GCP)

---

## 📈 Key Highlights

* Built a **scalable backend system using Spring Boot**
* Applied **microservices architecture principles**
* Implemented **asynchronous processing for performance**
* Designed for **real-world IoT data pipeline simulation**

---

## 👤 Author

**Jancy S**
Final Year Engineering Student | Aspiring Backend Engineer

* 💻 Passionate about scalable systems & backend engineering
* 🧠 Solved 450+ DSA problems
* ⚙️ Focused on microservices & distributed systems

---
