# Spring Boot CRUD API - Employee Management System

A simple REST API built with Spring Boot and MySQL for managing employees. Supports full CRUD operations.

## 🚀 Features

- Add new employees
- View employee list
- Update employee details
- Delete employees

## 🛠 Tech Stack

- Java
- Spring Boot
- Spring Data JPA
- MySQL
- Maven

## 📦 How to Run

1. Clone the repo
2. Update `application.properties` with your MySQL credentials
3. Run: mvn spring-boot:run

## 📁 API Endpoints

| Method | Endpoint        | Description          |
|--------|------------------|----------------------|
| GET    | `/employees`     | Get all employees    |
| POST   | `/employees`     | Add new employee     |
| PUT    | `/employees/{id}`| Update employee      |
| DELETE | `/employees/{id}`| Delete employee      |

## 🔗 Demo

You can deploy it on [Render](https://render.com), [Railway](https://railway.app), or locally.

