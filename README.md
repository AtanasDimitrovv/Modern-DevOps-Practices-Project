# Modern-DevOps-Practices-Project

This project contains a simple "Hello World" Spring Boot application. It uses some devOps practices to automate its software delivery.

# Technologies Used

Spring Boot

Docker: Tool for creating images and containers that simplifies app's deployment

GitHub Actions: A CI/CD platform integrated with GitHub repositories

Linter: Tool for analyzing code

Trivy: A comprehensive security scaner

Kubernetes: a system for automating deployment, scaling, and management of containerized applications

# CI/CD Pipeline



# Run Locally with Docker

To run this application locally with Docker:

1. Install Docker
2. Clone this repository
3. docker build -f Dockerfile .
4. docker run -p 8080:8080 <image-name>

# Run Locally with Minikube

To run this application locally with Minikube cluster:

1. Install kubectl
2. Install minikube
3. minikube start
4. kubectl apply -f deployment.yml
5. kubectl apply -f service.yml
6. minikube service spring-boot