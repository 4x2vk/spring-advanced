# Spring Advanced
A backend service built with Spring Boot, designed to manage authentication, task operations, and user interactions.

## Project Overview

This repository was initialized and debugged from a broken state. The application now runs successfully after resolving multiple critical issues across configuration, logic, and testing layers.

### Completed Tasks

| Level | Task Description |
|-------|------------------|
| Lv 0  | Fixed application startup errors and configuration issues |
| Lv 1  | Restored and re-implemented `AuthUserArgumentResolver` |
| Lv 2  | Refactored service logic for early returns, removed unnecessary `else` blocks, and moved password validation to DTO |
| Lv 3  | Resolved N+1 query problem using `@EntityGraph` in `TodoRepository` |
| Lv 4  | Corrected and improved test cases across multiple services |

---

## Built With

![JDK 17](https://img.shields.io/badge/JDK-17-orange?logo=java&logoColor=white) [![Spring Boot 3.3.3](https://img.shields.io/badge/Spring%20Boot-3.3.3-6DB33F?logo=springboot&logoColor=white)](https://spring.io/projects/spring-boot) ![Spring Data JPA](https://img.shields.io/badge/Spring%20Data%20JPA-6DB33F?logo=spring&logoColor=white) ![MySQL](https://img.shields.io/badge/MySQL-4479A1?logo=mysql&logoColor=white) ![Lombok](https://img.shields.io/badge/Lombok-ED1C24?logo=java&logoColor=white) ![Spring Security Crypto](https://img.shields.io/badge/Spring%20Security%20Crypto-6DB33F?logo=springsecurity&logoColor=white) ![Spring Boot Validation](https://img.shields.io/badge/Validation-Spring%20Boot%20Starter-6DB33F?logo=spring&logoColor=white) ![JUnit](https://img.shields.io/badge/JUnit-Platform-25A162?logo=junit5&logoColor=white) ![Mockito](https://img.shields.io/badge/Mockito-5.8.0-yellow?logo=java&logoColor=white) ![BCrypt](https://img.shields.io/badge/BCrypt-0.10.2-blue?logo=java&logoColor=white) ![JJWT](https://img.shields.io/badge/JJWT-0.11.5-blue?logo=jsonwebtokens&logoColor=white)

---

## ♻ Key Improvements

### Error Resolution

- Fixed multiple startup errors including misconfigured beans and missing dependencies.
- Added `application.yml` with proper JWT key setup.

### ArgumentResolver

- Re-implemented `AuthUserArgumentResolver` to correctly inject authenticated user context into controller methods.

### Code Refactoring

- **Early Return Logic**: Prevented unnecessary password encoding by checking for duplicate emails first.
- **Simplified Conditionals**: Removed nested `else` blocks for better readability in `WeatherClient`.
- **Validation Shift**: Moved password validation logic from service layer to DTO using annotations like `@Size`, `@Pattern`, and `@NotBlank`.

### Performance Optimization

- Replaced JPQL `fetch join` with `@EntityGraph` to resolve N+1 query issues in `TodoService`.

### Test Coverage

Fixed broken test cases:
- `PassEncoderTest` now correctly verifies password matching.
- `ManagerServiceTest` and `CommentServiceTest` updated to reflect correct exception handling.
- Renamed misleading test method names to match actual behavior.
- Adjusted service logic to ensure tests pass under updated conditions.
