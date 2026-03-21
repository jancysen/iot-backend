# IoT Data Monitoring Microservices System

## Overview
This project is a scalable backend system designed to ingest, process, and store real-time IoT sensor data using Spring Boot and microservices architecture.

## Architecture
Sensor → Ingestion Service → Processing Service → Storage Service → MySQL

## Features
- REST APIs for real-time sensor data ingestion
- Asynchronous processing for high-frequency data streams
- Modular microservices-based design
- JWT Authentication for secure access
- Optimized database queries using JPA/Hibernate

## Tech Stack
- Java, Spring Boot
- MySQL
- JPA/Hibernate
- REST APIs
- Async Processing

## Microservices Breakdown
- Ingestion Service: Receives sensor data
- Processing Service: Filters and processes incoming data
- Storage Service: Persists data in MySQL

## How to Run
1. Clone the repo
2. Run using:
   mvn spring-boot:run

[Sensor]
   ↓
[Ingestion Service] → [Processing Service] → [Database]

## API Endpoints

POST /api/sensor-data
GET /api/sensor-data/{id}
