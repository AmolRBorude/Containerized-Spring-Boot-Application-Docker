
# Containerized Spring Boot Application Docker

A Spring Boot application containerized using Docker, integrated with MySQL and phpMyAdmin, and managed using Docker Compose.

## 🚀 Technologies Used

- Java 21
- Spring Boot
- Maven
- Docker
- Docker Compose
- MySQL 8
- phpMyAdmin

## 📌 Project Overview

This project demonstrates how to containerize a Spring Boot application and run it alongside a MySQL database using Docker Compose. phpMyAdmin provides a graphical interface for database management.

## 🏗️ Project Architecture

- **Spring Boot:** Backend application
- **MySQL:** Relational database
- **phpMyAdmin:** Database administration interface
- **Docker Compose:** Manages the application services

## 📂 Project Structure

```text
Docker-Learning-Project/
├── .mvn/
├── src/
│   └── main/
│       ├── java/
│       └── resources/
│           └── application.properties
├── .gitignore
├── Dockerfile
├── docker-compose.yml
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
```

## ⚙️ Prerequisites

Install the following tools:

- [Java JDK 21](https://adoptium.net/)
- [Docker Desktop](https://www.docker.com/products/docker-desktop/)
- [Git](https://git-scm.com/)

## 📥 Clone the Repository

```bash
git clone https://github.com/AmolRBorude/Containerized-Spring-Boot-Application-Docker.git
cd Containerized-Spring-Boot-Application-Docker
```

## ▶️ Run the Application

Make sure Docker Desktop is running.

Build and start all services:

```bash
docker compose up -d --build
```

Check the container status:

```bash
docker compose ps -a
```

## 🌐 Application URLs

| Service | Address |
|---|---|
| Spring Boot | http://localhost:8082/ |
| phpMyAdmin | http://localhost:8081/ |
| MySQL from Windows | localhost:3308 |
| MySQL inside Docker | mysql:3306 |

## 🗄️ Database Configuration

MySQL uses port `3306` inside Docker and is exposed on host port `3308`.

For connections from Spring Boot or phpMyAdmin inside Docker Compose:

```text
Host: mysql
Port: 3306
```

For connections from your local computer:

```text
Host: localhost
Port: 3308
```

Use the database name and credentials configured in your local environment and `docker-compose.yml`.

## 🛠️ Useful Docker Commands

Start services:

```bash
docker compose up -d
```

Stop services:

```bash
docker compose stop
```

Restart services:

```bash
docker compose restart
```

View logs:

```bash
docker compose logs -f
```

View Spring Boot logs:

```bash
docker compose logs --tail=50 springboot
```

View MySQL logs:

```bash
docker compose logs --tail=50 mysql
```

View phpMyAdmin logs:

```bash
docker compose logs --tail=50 phpmyadmin
```

Rebuild Spring Boot:

```bash
docker compose up -d --build --force-recreate springboot
```

Stop and remove containers:

```bash
docker compose down
```

> **Warning:** Avoid `docker compose down -v` unless you intend to remove the associated volumes and potentially delete persistent database data.

## 🔐 Security

- Never commit passwords, API keys, or secrets to GitHub.
- Add `.env` to `.gitignore`.
- Use environment variables for sensitive configuration.
- Do not expose database ports publicly in production.

## 🎯 Learning Outcomes

- Containerizing a Spring Boot application
- Connecting Spring Boot with MySQL
- Managing multiple containers using Docker Compose
- Managing databases through phpMyAdmin
- Inspecting container status and logs
- Version control using Git and GitHub

## 👨‍💻 Author

**Amol Ramdas Borude**

GitHub: [AmolRBorude](https://github.com/AmolRBorude)

## 📄 License

This project is intended for educational and learning purposes.
