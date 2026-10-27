# Bus Route CRUD Application

A simple CRUD application built using React, Spring Boot, and PostgreSQL. The main focus of this project is Docker, Docker Compose, and GitHub Actions.

## Docker & GitHub Actions

Whenever I push code changes to GitHub, the GitHub Actions workflow automatically builds new Docker images for the frontend and backend and pushes them to Docker Hub.

This helps keep the application images up to date without having to build and upload them manually.

## Docker Compose

The `docker-compose.yml` file makes it easy to run the entire application on any machine with Docker installed.

It pulls the latest frontend, backend, and PostgreSQL images from Docker Hub and starts all the containers together.

The PostgreSQL data is stored in a persistent Docker volume, so the data remains available even if the containers are stopped or recreated.

## How to Run

Make sure Docker and Docker Compose are installed, then run:

```bash
docker compose pull
docker compose up -d
```

Docker Compose downloads the latest images and starts the application.

## Technologies Used

- React
- Spring Boot
- PostgreSQL
- Docker
- Docker Compose
- GitHub Actions
- Docker Hub

## What I Learned

Through this project, I learned how to containerize a full-stack application, automate Docker image builds and uploads using GitHub Actions, and run multiple containers together using Docker Compose with persistent database storage.
