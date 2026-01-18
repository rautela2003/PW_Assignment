🧪 My Testing App

This is a sample Java testing project demonstrating the use of Unit Tests, Integration Tests, and End-to-End (E2E) Tests using JUnit 5 and Selenium WebDriver.

📂 Project Structure
```
my-testing-app/
├── pom.xml
├── src/
│   ├── main/
│   │   └── java/com/example/
│   │       ├── App.java
│   │       ├── Calculator.java
│   │       └── CalculatorService.java
│   └── test/
│       └── java/com/example/
│           ├── CalculatorTest.java          # Unit Tests
│           ├── CalculatorServiceTest.java   # Integration Tests
│           └── LoginTest.java               # End-to-End Test (Selenium)
```

⚙️ Technologies Used
```
| Tool              | Purpose                          |
| ----------------- | -------------------------------- |
| **Java 17**       | Programming language             |
| **JUnit 5**       | Unit and integration testing     |
| **Selenium 4.25** | Browser automation (E2E testing) |
| **Maven**         | Build & dependency management    |
```
🚀 Setup Instructions

1. Clone the Repository
```bash
git clone https://github.com/rautela2003/PW_Assignment.git
cd Assignment 9/my-testing-app/
```
2. Check Java & Maven Installation
```bash
java -version
mvn -version
```
Java 17+ and Maven 3.8+ are recommended.

3. Install Dependencies
```bash
mvn clean install
```
🧩 Run Tests

Run All Tests
```bash
mvn test
```

🏁 Expected Output
```
[INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0
[INFO] BUILD SUCCESS
```




