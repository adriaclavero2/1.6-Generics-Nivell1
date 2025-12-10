Task 6

Description: Learning project in Java to compare the behavior of classes without generics with generic methods. The goal is to understand how generics allow flexibility in passing parameters of different types and in any order.

📌 Exercise Statement

Exercise 1 — Class without generics

Create a class NoGenericMethods that stores three arguments of the same type.
Add a constructor that initializes these values.
Implement methods getElement1(), getElement2(), getElement3() to access them.
Verify that the arguments can be passed in any order to the constructor.
Objective: serve as a comparison with the later generic version.



Exercise 2 — Generic method with diverse parameters

Create a class Person with attributes name, surname, and age.
Create a class GenericMethods with a generic method printElements() that accepts three arguments of generic type and prints them to the screen.
In the main() method, call this generic method with different combinations of parameters (e.g., a Person, a String, and a primitive numeric value).
Objective: verify that generic methods can accept any combination of types and in any order.


✨ Features

Comparison between a class without generics and a generic method.
Printing of objects and values of different types.
Practical example of reusing classes (Person) and generic methods (printElements).


🛠 Technologies

Java 21 or higher for implementing the exercises.

🚀 Installation and Execution

Clone the repository.
Compile and run in a compatible IDE.
Tests: execute the different main() methods to check the behavior of the classes.


🧩 Diagrams and justification of technical decisions

Class without generics (NoGenericMethods): shows the rigidity of working with a single data type.
Generic method (printElements): allows flexibility and reuse, since it can accept any combination of types.
Class Person: adds realism to the example, demonstrating that generics work with custom objects.
