# 🚀 IoT Data Monitoring Microservices System

## 📌 Overview
This project is a scalable backend system designed to ingest, process, and store real-time IoT sensor data using **Spring Boot** and a **microservices architecture**.

It simulates a real-world IoT pipeline handling high-frequency sensor data with asynchronous processing and modular service design.

---

## 🏗️ Architecture
Sensor
↓
Ingestion Service → Processing Service → Storage Service → MySQL

---

## ⚙️ Features

- 🚀 REST APIs for real-time sensor data ingestion
- ⚡ Asynchronous processing for high-frequency data streams
- 🧩 Modular microservices-based architecture
- 🔐 JWT Authentication for secure API access
- 📊 Optimized database operations using JPA/Hibernate

---

## 🧠 Microservices Breakdown

- **Ingestion Service**
  - Receives incoming sensor data via APIs

- **Processing Service**
  - Filters, validates, and processes sensor data

- **Storage Service**
  - Persists processed data into MySQL database

---

## 🛠️ Tech Stack

- **Backend:** Java, Spring Boot  
- **Database:** MySQL  
- **ORM:** JPA / Hibernate  
- **Architecture:** Microservices  
- **Other:** REST APIs, Async Processing, JWT Auth  

---

## 📡 API Endpoints

| Method | Endpoint | Description |
|--------|--------|-------------|
| POST | /api/sensor-data | Submit sensor data |
| GET | /api/sensor-data/{id} | Fetch sensor data |

---

## ▶️ How to Run

```bash
# Clone the repository
git clone https://github.com/jancysen/iot-microservices-system.git

# Navigate to project
cd iot-microservices-system

# Run the application
mvn spring-boot:run
