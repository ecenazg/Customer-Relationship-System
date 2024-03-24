# Customer Relationship System

The Customer Relationship System (CRS) is a Spring Boot-based web application designed to help businesses manage their customer information efficiently. This system allows for the addition, update, and deletion of customer details, as well as viewing a list of all customers. Built with Spring Boot, Thymeleaf, Spring Data JPA, and Hibernate, CRS offers a simple yet powerful platform for managing customer interactions and data.

## Features

- **List Customers**: View all customers in a paginated list.
- **Add New Customer**: Enter details of new customers into the system.
- **Update Customer**: Modify existing customer information.
- **Delete Customer**: Remove customer records from the system.
- **Search**: Find customers by name or id.

## Technologies

- Spring Boot
- Spring MVC
- Thymeleaf
- Spring Data JPA
- Hibernate
- MySQL

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

- JDK 1.8 or later
- Maven 3.2+
- MySQL 5.6 or later

### Installing & Running

1. **Clone the repository**

```bash
git clone https://github.com/ecenazg/Customer-Relationship-System.git
```
2. **Configure MySQL**
Create a database in MySQL and update src/main/resources/application.properties with your MySQL username and password, as well as the database URL.
```bash
spring.datasource.url=jdbc:mysql://localhost:3306/your_database?useSSL=false&serverTimezone=UTC
spring.datasource.username=your_username
spring.datasource.password=your_password
```
3. **Run the application**
Navigate to the project directory and run the application using Maven.
```bash
cd Customer-Relationship-System
mvn spring-boot:run
```
- The application should be accessible at http://localhost:8080.
