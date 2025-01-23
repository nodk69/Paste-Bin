---

# Pastebin - Spring Boot

A simple Pastebin-like application built using **Spring Boot**. This project allows users to store and retrieve text content (pastes) via REST APIs. It also supports user management, where users can create and manage their pastes.

---

## Features

- **Create Paste**: Store text content with optional expiration and visibility settings.
- **Retrieve Paste**: Fetch stored content by ID.
- **Get All Content**: Retrieve all stored content.
- **User Management**: Create users and associate pastes with them.
- **DTO-Based Responses**: Uses `ContentWriterDTO` and `ContentViewerDTO` for structured responses.

---

## Technologies Used

- **Spring Boot**: Backend framework.
- **Spring Data JPA**: For database operations.
- **H2 Database**: In-memory database (can be replaced with MySQL, PostgreSQL, etc.).
- **Lombok**: For reducing boilerplate code.
- **Maven**: Build tool.

---

## API Endpoints

### Paste Endpoints

| HTTP Method | Endpoint              | Description                          |
|-------------|-----------------------|--------------------------------------|
| `POST`      | `/home`               | Create a new paste.                  |
| `GET`       | `/home/{id}`          | Retrieve a paste by ID.              |
| `GET`       | `/home/allContent`    | Retrieve all stored content.         |

### User Endpoints

| HTTP Method | Endpoint              | Description                          |
|-------------|-----------------------|--------------------------------------|
| `POST`      | `/user`               | Create a new user.                   |

---

## Project Structure

```
src/main/java
├── com.example.pastebin
│   ├── controllers
│   │   ├── PasteController.java       # REST controller for pastes
│   │   └── UserController.java        # REST controller for users
│   ├── DTO
│   │   ├── ContentWriterDTO.java      # DTO for creating pastes
│   │   └── ContentViewerDTO.java      # DTO for viewing pastes (currently empty)
│   ├── entities
│   │   ├── Paste.java                 # Paste entity
│   │   └── User.java                  # User entity
│   ├── repository
│   │   ├── PasteRepository.java       # JPA repository for pastes
│   │   └── UserRepository.java        # JPA repository for users
│   ├── service
│   │   ├── PasteService.java          # Service layer for pastes
│   │   └── UserService.java           # Service layer for users
│   └── PastebinApplication.java       # Main application class
src/main/resources
├── application.properties             # Configuration file
