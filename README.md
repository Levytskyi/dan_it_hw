# QA Automation with Java

Coursework and practical assignments from the **QA Automation with Java** course at **DAN.IT Education**.

The repository covers Java Core, automated REST API testing, browser automation, test reporting, TestRail integration, and behavior-driven testing.

## Tools and technologies

| Area | Tools and technologies |
| --- | --- |
| Programming | Java |
| Build and dependencies | Maven |
| Test frameworks | JUnit 4, TestNG |
| REST API automation | REST Assured, Jackson, JSON, DTOs |
| Browser automation | Selenium WebDriver, ChromeDriver, Selenide |
| Reporting | Allure Report |
| Test management integration | TestRail API |
| Behavior-driven testing | Cucumber, Gherkin |
| Development workflow | Git, GitHub, IntelliJ IDEA |

## Java Core

The [Java assignments](https://github.com/Levytskyi/dan_it_hw/tree/main/hometasks/src/main/java) cover:

- Variables, data types, conditions, loops, methods, and arrays.
- Classes, constructors, encapsulation, inheritance, polymorphism, abstract classes, and interfaces.
- Collections, maps, queues, deques, sorting, and comparators.
- Object equality with `equals()` and `hashCode()`.
- Singleton, Factory, and Builder patterns.
- Dates and times with the Java Time API.
- Functional interfaces, lambda expressions, and Stream API.
- Exception handling, custom exceptions, and `Optional`.

## Automation assignments

| Homework | Focus |
| --- | --- |
| 2 | REST API tests for Swagger Petstore: GET, POST, PUT, DELETE, DTOs, JSON mapping, and assertions |
| 3 | First browser automation exercises with Selenium WebDriver and ChromeDriver |
| 4 | Web element interactions and CSS/XPath locators |
| 5 | Synchronization: implicit waits, explicit waits, FluentWait, and ExpectedConditions |
| 6 | TestNG lifecycle annotations, DataProvider, listeners, and XML test suites |
| 7 | Page Object Model with Selenium, shared BasePage and BaseTest classes |
| 8 | Page Objects and UI tests with Selenide |
| 9 | Allure integration, test steps, descriptions, and epic/feature/story metadata |
| 10 | Publishing automated test results to TestRail through its REST API |
| 11 | Cucumber scenarios, Gherkin feature files, step definitions, and a JUnit runner |

## Exploring the assignments

Clone the repository:

```bash
git clone https://github.com/Levytskyi/dan_it_hw.git
cd dan_it_hw
```

Open `hometasks/pom.xml` as a Maven project in IntelliJ IDEA. Use a JDK compatible with the project dependencies, then run the relevant Java class, test class, TestNG XML suite, or Cucumber runner.

Run configurations and integrations vary by assignment. The TestRail homework requires credentials and run/case IDs for the TestRail instance being used.

## Author

**Mykhailo Levytskyi**

[GitHub Profile](https://github.com/Levytskyi)
