# SmartEventSystem

## Overview

**SmartEventSystem** is a Java-based application that simulates a university event management system while demonstrating the practical use of multiple **Object-Oriented Design Patterns**. The project was developed to showcase how different design patterns can work together to create a flexible, maintainable, and scalable software architecture.

The system allows users to create different types of campus events, customize bookings with optional services, manage the lifecycle of event bookings, and process payments using interchangeable payment methods. By separating responsibilities into different design patterns, the application follows the principles of modular software design and promotes code reusability.

---

## Features

- Create multiple event types (Conference, Club Meeting, Online Workshop, etc.)
- Generate event resources using the **Abstract Factory** pattern
- Dynamically add optional services such as:
  - Catering
  - Security
  - Cleaning
  - Recording
- Manage booking status using the **State** pattern
- Support multiple payment methods using the **Strategy** pattern
- Calculate booking costs dynamically
- Demonstrate strong object-oriented programming principles
- Organized into packages for improved readability and maintainability

---

## Design Patterns Implemented

### Creational Pattern
**Abstract Factory**

Used to create families of related objects for different event types without exposing the object creation logic.

Examples:
- ConferenceFactory
- ClubMeetingFactory
- OnlineWorkshopFactory

---

### Structural Pattern
**Decorator**

Used to dynamically add optional services to an existing event booking without modifying the original booking object.

Examples:
- CateringDecorator
- SecurityDecorator
- CleaningDecorator
- RecordingDecorator

---

### Behavioral Patterns

#### State

Controls the behavior of an event booking based on its current status.

Booking lifecycle:

- Pending
- Confirmed
- Checked In
- Completed
- Cancelled

Each state determines which operations are allowed at that point in the booking process.

#### Strategy

Allows payment methods to be changed at runtime without modifying the payment processing logic.

Supported payment methods include:

- Credit Card
- Student Card
- Department Account

---

## Project Structure

```text
SmartEventSystem
│
├── Creational
│   ├── EventFactory
│   ├── ConferenceFactory
│   ├── ClubMeetingFactory
│   ├── OnlineWorkshopFactory
│   └── ...
│
├── Structural
│   ├── EventBooking
│   ├── EventDecorator
│   ├── CateringDecorator
│   ├── SecurityDecorator
│   └── ...
│
├── Behavioral
│   ├── State
│   └── Strategy
│
└── Demo.java
```

---

## Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Design Patterns (GoF)

---

## Learning Objectives

This project demonstrates how multiple Gang of Four (GoF) design patterns can be integrated into a single application. It highlights how each pattern addresses a specific software design problem while working together to produce a clean, extensible, and maintainable architecture.

The project also reinforces core object-oriented principles such as abstraction, encapsulation, polymorphism, composition, and loose coupling.

---

## Author

**Daniel**
