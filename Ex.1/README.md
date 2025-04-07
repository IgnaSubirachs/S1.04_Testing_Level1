# 📝 Exercise 1 - Library Book Collection Management

## 📄 **Description - Exercise Statement**

This exercise involves creating a Java class to manage a collection of books in a library. The class should allow for the addition, retrieval, and removal of books from the collection.

### The following functionalities must be implemented:

- Add books to the collection
- Retrieve the full list of books
- Get the title of a book given its position
- Add a book at a specific position
- Remove a book by its title

### The implementation must be verified using **JUnit tests**:

- ✅ Ensure the list is not `null` after creating a new object
- ✅ Verify the list has the expected size after adding multiple books
- ✅ Check that a specific book is in the correct position
- ✅ Ensure there are **no duplicate titles** in the list
- ✅ Retrieve the title of a book given a specific position
- ✅ Confirm that adding a book updates the list correctly
- ✅ Check that removing a book decreases the list size
- ✅ Verify that the list remains **alphabetically sorted** after additions or removals

---

## 💻 **Technologies Used**

- Java (JDK 17 or higher recommended)
- JUnit 5 (for unit testing)
- IntelliJ IDEA / Eclipse / Visual Studio Code

---

## 📋 **Requirements**

- Java Development Kit (JDK 17 or above)
- Java IDE (e.g., IntelliJ, Eclipse, VSCode)
- JUnit 5 (included via Maven, Gradle, or manually)

---

## 🛠️ **Installation**

1. Clone the repository or download the source code
2. Open the project in your favorite Java IDE
3. Make sure Java SDK and JUnit 5 are properly configured
4. (If using Maven, include JUnit in your `pom.xml`)

```xml
<dependencies>
  <dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter</artifactId>
    <version>5.9.2</version>
    <scope>test</scope>
  </dependency>
</dependencies>
