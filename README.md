# QA Automation with Java

Coursework and practical assignments from the **QA Automation with Java** course at **DAN.IT Education**.

The repository covers Java Core, automated REST API testing, browser automation, test reporting, TestRail integration, and behavior-driven testing.

## Repository organization

- **`main`** contains the Java Core assignments and the REST API tests from automation homework 2.
- **`hw_*` branches** preserve individual Java homework submissions.
- **`automation_hw_2`–`automation_hw_11` branches** contain the automation assignments listed below. Later assignments are available in their own branches and are not all merged into `main`.
- **`hometasks/pom.xml`** defines the Maven project in each branch.

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

| Homework | Focus | Branch |
| --- | --- | --- |
| 2 | REST API tests for Swagger Petstore: GET, POST, PUT, DELETE, DTOs, JSON mapping, and assertions | [automation_hw_2](https://github.com/Levytskyi/dan_it_hw/tree/automation_hw_2) |
| 3 | First browser automation exercises with Selenium WebDriver and ChromeDriver | [automation_hw_3](https://github.com/Levytskyi/dan_it_hw/tree/automation_hw_3) |
| 4 | Web element interactions and CSS/XPath locators | [automation_hw_4](https://github.com/Levytskyi/dan_it_hw/tree/automation_hw_4) |
| 5 | Synchronization: implicit waits, explicit waits, FluentWait, and ExpectedConditions | [automation_hw_5](https://github.com/Levytskyi/dan_it_hw/tree/automation_hw_5) |
| 6 | TestNG lifecycle annotations, DataProvider, listeners, and XML test suites | [automation_hw_6](https://github.com/Levytskyi/dan_it_hw/tree/automation_hw_6) |
| 7 | Page Object Model with Selenium, shared BasePage and BaseTest classes | [automation_hw_7](https://github.com/Levytskyi/dan_it_hw/tree/automation_hw_7) |
| 8 | Page Objects and UI tests with Selenide | [automation_hw_8](https://github.com/Levytskyi/dan_it_hw/tree/automation_hw_8) |
| 9 | Allure integration, test steps, descriptions, and epic/feature/story metadata | [automation_hw_9](https://github.com/Levytskyi/dan_it_hw/tree/automation_hw_9) |
| 10 | Publishing automated test results to TestRail through its REST API | [automation_hw_10](https://github.com/Levytskyi/dan_it_hw/tree/automation_hw_10) |
| 11 | Cucumber scenarios, Gherkin feature files, step definitions, and a JUnit runner | [automation_hw_11](https://github.com/Levytskyi/dan_it_hw/tree/automation_hw_11) |

## Exploring the assignments

Clone the repository and select the branch for the assignment you want to explore:

```bash
git clone https://github.com/Levytskyi/dan_it_hw.git
cd dan_it_hw
git switch automation_hw_11
```

Open `hometasks/pom.xml` as a Maven project in IntelliJ IDEA. Use the JDK and dependencies configured for the selected branch, then run the relevant Java class, test class, TestNG XML suite, or Cucumber runner.

Run configurations and integrations vary by assignment. The TestRail homework requires credentials and run/case IDs for the TestRail instance being used.

## Author

**Mykhailo Levytskyi**

[GitHub Profile](https://github.com/Levytskyi)
