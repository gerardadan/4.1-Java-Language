## 📄 Description - Exercise Statement

### Level 1: JUnit

#### Exercise 1: Managing a Library Book Collection
Create a Java class to manage a collection of books in a library. The class should allow adding books, retrieving the book list, getting a specific book by its position, adding a book at a specific position, and removing a book by title.

📌 **Functionalities:**
- Add books to the collection.
- Retrieve the complete list of books.
- Get the title of a book at a given position.
- Add a book at a specific position.
- Remove a book by title.

✅ **JUnit Verification:**
- Ensure the book list is not null after creating a new object.
- Verify the expected size of the list after inserting multiple books.
- Ensure a specific book is found at its correct position.
- Verify there are no duplicate book titles.
- Check retrieval of a book title given a specific position.
- Ensure adding a book correctly modifies the list.
- Confirm that removing a book decreases the list size.
- Verify that the list remains alphabetically ordered after adding or removing a book.

#### Exercise 2: Calculating DNI Letter
Create a class called `CalculoDni` that calculates the letter of the Spanish DNI (National Identity Document) by receiving the number as a parameter.

✅ **JUnit Verification:**
- Create a parameterized test class to validate the calculation for 10 predefined DNI numbers.

#### Exercise 3: Throwing an ArrayIndexOutOfBoundsException
Create a class with a method that throws an `ArrayIndexOutOfBoundsException`.

✅ **JUnit Verification:**
- Create a test to verify that the exception is correctly thrown.

## 💻 Technologies Used
- Java
- JUnit
- Object-Oriented Programming (OOP)
- Java Exceptions
- Java Collections

## 📋 Requirements
To run this project, you need:
- JDK 8 or higher
- A development environment such as IntelliJ IDEA, Eclipse, or VS Code with Java support
- Basic knowledge of Java and JUnit

### To compile and run the project from the terminal:
```sh
javac Library.java CalculoDni.java ExceptionTest.java Main.java
java Main
```

