# Eye Care Hospital MCP Integration Platform

> MCP-Based Multi-Service Integration Platform built with Spring Boot

## Architecture
A Spring Boot middleware layer connects 5 hospital microservices via REST APIs, with request routing, JSON validation, and a unified `/api/*` gateway.

## Services
| Endpoint | Description |
|---|---|
| `GET /api/patients` | Patient registration & records |
| `GET /api/appointments` | Appointment scheduling |
| `GET /api/doctors` | Doctor directory |
| `GET /api/prescriptions` | Prescription management |
| `GET /api/billing` | Billing & payments |

## Tech Stack
- **Backend:** Java 17, Spring Boot 3.2, Spring Web, Jakarta Validation
- **Frontend:** HTML5, CSS3, Vanilla JS
- **Architecture:** MCP Middleware Pattern, REST APIs, In-memory stores

## Running Locally
```bash
mvn spring-boot:run
```
Open `http://localhost:8080`
