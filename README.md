# jacobs-senior-qa-serenity

# Jacobs Senior QA Serenity Framework

## **Overview**

This project demonstrates a simple test automation framework built using:

- Java 17
- Selenium WebDriver
- Serenity BDD
- REST Assured
- JUnit 5
- Maven

The framework supports both UI and API testing and follows a scalable structure that can be extended to support larger regression suites and CI/CD pipelines.


## **Technologies used in this demo:**

- **Java** - Programming language
- **Selenium WebDriver** - Browser automation
- **Serenity BDD** - Test framework and reporting
- **REST Assured** - API testing
- **JUnit** - Test execution
- **Maven** - Dependency management and build


## **Test Coverage**: 

### **UI Test**

UrlValidationTest:

Validates that the Jacobs website loads successfully and confirms the expected URL is displayed.


### **API Test**

ApiValidationTest:

Performs a simple REST API validation and verifies the response status code.


## **Design Principles**

The framework has been designed to:

- Support UI and API automation within a single project
- Separate test logic from page interactions using the Page Object Model
- Provide readable test reports through Serenity BDD
- Support future integration into CI/CD pipelines
- Allow easy extension for additional tests and environments


## **Running the Tests**

### Execute all tests:

```bash
mvn clean verify*
```

### Execute a specific API test:

```bash
mvn -Dtest=api.ApiValidationTest test*
```

### **Execute a specific UI test:**

```bash
mvn -Dtest=ui.UrlValidationTest test
```

## **Reporting**

Serenity generates detailed HTML reports after execution.


### Generate reports:

```bash
mvn serenity:aggregate
```

### Reports are available under:

```bash
target/site/serenity
```



## **Future Enhancements**

Potential improvements include:

- Environment configuration management
- Test data management
- Parallel execution
- CI/CD integration (GitHub Actions/Jenkins)
- Accessibility testing
- Performance testing integration
- API request/response logging
- Cross-browser execution
- Docker support





Author

Darren Harley
