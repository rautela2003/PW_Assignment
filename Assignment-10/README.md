# My App - Integration Tests

This project demonstrates setting up an environment for **integration testing** with Node.js, Express, and PostgreSQL using Docker. The integration tests validate interactions between the API and the database.

---

## 📂 Project Structure
```
my-app/
├── docker-compose.yml # Docker Compose file for PostgreSQL
├── .env # Development environment variables
├── .env.test # Test environment variables
├── package.json # Project dependencies and scripts
├── src/
│ ├── app.js # Express app
│ ├── server.js # App entry point
│ ├── db/
│ │ └── index.js # Database client
│ └── routes/ # API routes
├── tests/
│ └── integration/
│ └── users.int.test.js # Integration tests
├── jest.config.js # Jest configuration
```

---

## ⚙️ Prerequisites

- **WSL2** (Ubuntu recommended)  
- **Node.js v24 LTS**  
- **npm**  
- **Docker Desktop** (with WSL2 integration)  

---

## 🔧 Setup

1. Clone the repository:
```bash
git clone https://github.com/rautela2003/PW_Assignment.git
cd Assignment-10/my-app/
```
## Install dependencies:

```bash
npm install
```
Start the PostgreSQL container:

```bash
docker-compose up -d db
```
## Verify the container is healthy:

```bash
docker ps
# STATUS should show "Up (healthy)"
```

### 🧪 Running Integration Tests

```bash
npm test
```

Expected Output:
```
PASS  tests/integration/users.int.test.js
  Users integration
    ✓ POST /users creates a user and GET /users returns it (xx ms)
```

