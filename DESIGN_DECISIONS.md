# Design Decisions and Assumptions

## Design Decisions
### 1. Layered Architecture
The project follows a simple layered architecture:

- Controller Layer → handles HTTP requests
- Service Layer → business logic
- DAO Layer → data access
- Model Layer → task entity

### 2. In-Memory Storage
Used Java HashMap as temporary storage instead of a database.
Reason:
- Simpler implementation
- Faster development
- Suitable for case study

### 3. Basic Authentication
Implemented Spring Security Basic Authentication.
Reason:
- Bonus requirement
- Easy to configure
- Protects API endpoints

### 4. Exception Handling
Global exception handling added for:
- Task not found
- Invalid requests
This improves API usability.

### 5. Validation
Added request validation for task title.

## Assumptions
- Single-user application
- No persistent database required
- Data resets when application restarts
- Authentication credentials are hardcoded
- Focus on clean code over advanced features
