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

![2024-01-08 21 46 50](https://github.com/AtanasDimitrovv/Modern-DevOps-Practices-Project/assets/105561312/67042a1c-f10c-45b1-beb6-145d36a0827e)

- In the Local Tests step the code is tested to ensure that it works as expected. 
- In the Lint Code Base step Super Linter is used to analyze the code for errors.
- In the Trivy Scan step multiple things are happening. Firstly, a ".jar" file is created by running maven. Then this file is used for the creation of a docker image which is used by trivy scan to check for vulnerabilities.
- In the Build step a docker image is pushed to docker hub after creating it like in the like step.
- In the Deploy to Minikube step a Minikube cluster is set up. After it is running, with the usage of the "deployment.yml" and "service.yml" files the application is deployed.

# Run Locally with Docker

To run this application locally with Docker:

1. Install Docker
2. Clone this repository
3. docker build -f Dockerfile .
4. docker run -p 8080:8080 \<image-name\>

# Run Locally with Minikube

To run this application locally with Minikube cluster:

1. Install kubectl
2. Install minikube
3. minikube start
4. kubectl apply -f deployment.yml
5. kubectl apply -f service.yml
6. minikube service spring-boot
