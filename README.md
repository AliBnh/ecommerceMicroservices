```markdown
# E-commerce Application Using Microservices Architecture

This project serves as a practical exploration of microservices architecture, domain-driven design (DDD), and various Spring technologies. It demonstrates the implementation of an e-commerce application using modern tools and techniques.

## Table of Contents
- [System Design](#system-design)
- [Technologies Used](#technologies-used)
- [Microservices Architecture](#microservices-architecture)
  - [Synchronous and Asynchronous Communication](#synchronous-and-asynchronous-communication)
  - [Distributed Tracing](#distributed-tracing)
- [Application Functionalities](#application-functionalities)
  - [Product Management](#product-management)
  - [Customer Management](#customer-management)
  - [Order Management](#order-management)
  - [Payment Processing](#payment-processing)
- [Non-Functional Requirements](#non-functional-requirements)

## System Design
![micro-services-global-architecture drawio](https://github.com/AliBnh/ecommerceMicroservices/assets/107149305/d8b536ed-2c47-41b6-a37a-387b3a722b4c)


## Technologies Used
- **Microservices Architecture**: The application is divided into independent, loosely coupled services for improved scalability and maintainability.
- **Domain-Driven Design (DDD)**: The code is structured around business domains, promoting better code organization and understanding.
- **Spring Boot**: Provides a rapid application development framework for building microservices.
- **Spring Cloud**: Offers a suite of tools for building distributed systems with Spring Boot, including:
  - **Spring Cloud Config Server**: Manages configuration for all microservices.
  - **Spring Cloud Eureka Server**: Enables service discovery for microservices to locate each other.
  - **Spring Cloud API Gateway**: Acts as a single entry point for external requests, routing them to relevant microservices.
- **Spring Data JPA & Spring Data MongoDB**: Provides data access layers for relational (JPA) and NoSQL (Mongo) databases, allowing persistence based on your needs.
- **Kafka**: Used for asynchronous messaging between services.
- **Zipkin**: Enables distributed tracing to monitor requests across all microservices.
- **Keycloak**: Provides a robust solution for implementing authentication and authorization.

## Microservices Architecture
The application is divided into independent microservices:
- **Customer service**
- **Order service**
- **Payment service**
- **Notification service (for emails)**

Each service handles its specific functionality and communicates with others through APIs.
- Configuration management is implemented using a dedicated config server.
- Service discovery is achieved using Eureka server.
- API Gateway acts as a single entry point for external requests, routing them to relevant microservices.

### Synchronous and Asynchronous Communication
- Microservices can communicate directly using RESTful APIs (RestTemplate | OpenFeign).
- Asynchronous communication is implemented with Kafka for handling tasks like sending emails after placing orders.

### Distributed Tracing
- The application uses Zipkin for distributed tracing, allowing us to monitor requests across all microservices.

## Application Functionalities

### Product Management
- **Product Creation**: Administrators can add new products to the system.
- **Product Listing**: Customers can browse all available products.
- **Product Update & Delete**

### Customer Management
- **Customer Registration**: Customers can create accounts to store their information for easier future purchases.
- **Customer Lookup**: The admin can list/search customers based on their ID.

### Order Management
- **Order Placement**: Customers can create orders by selecting products and finalizing the purchase.
- **Order History**: Customers can view their past orders.

### Payment Processing
- **Payment Confirmation**: Customers receive confirmation notifications (email) for successful payments.

## Non-Functional Requirements
- **Scalability**: The microservices architecture allows for independent scaling of each service to handle increased load.
- **Availability**: The use of multiple independent services helps improve overall application availability if one service encounters an issue.
- **Maintainability**: Modular microservices are easier to maintain and update compared to a monolithic application.
- **Security**: Security considerations like user authentication, data encryption, and access control are crucial.
- **Performance**: API Gateway and communication protocols like RESTful APIs and asynchronous messaging can improve overall application performance.
```
