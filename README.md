# Pizza-Calculator 🍕
A fun and simple Java console application that calculates how many pizza slices each person gets and how many slices will be left over. Originally taken from the book
## Exercises for Programmers: 57 Challenges to Develop Your Coding Skills 1st Edition by Brian P. Hogan

## 📌 Overview
**Pizza-Calculator** is a console-based Java application designed to practice fundamental programming concepts like user input, arithmetic operations, and clean code structure. The application takes user input for the number of people, number of pizzas, and the number of slices per pizza, then calculates the number of slices per person and the leftover slices.

This project is structured with clean separation of concerns using packages and multiple classes to handle logic and reporting.

## 🧱 Features
- 👥 Takes the number of people sharing pizzas
- 🍕 Takes the number of pizzas and slices per pizza
- ➗ Calculates slices per person
- 🧮 Calculates remaining (leftover) slices
- 🧾 Displays a simple report of the result

## 🧩 Package & Class Structure

### `com.utilities`
- `Console`  
  Provides reusable static methods for console input handling.

### `com.exercises`
- `Main`  
  Entry point of the application. Coordinates flow of execution.

- `PizzaCalculator`  
  Contains logic for calculating slices per person and leftover slices.

- `PizzaReport`  
  Takes a `PizzaCalculator` object and formats the output report for display.

## 🚀 How to Run
1. Clone the repository:
   ```bash
   git clone git@github.com:eskay-7/Pizza-Calculator.git
   ```
2. Navigate to the project directory and compile:
   ```bash
   javac *.java
   ```
3. Run the application:
   ```bash
   java com.exercises.Main
   ```

## 🛠️ Technologies Used
- Java (Core)
- Console I/O
- OOP Principles
- Package Structuring

## 🎯 Future Improvements
- Add input validation and exception handling
- Support for decimal slices (if using different pizza shapes)
- Option to save reports to a text file
- Unit testing with JUnit

## 🙌 Acknowledgements
Created as a learning exercise to improve Java programming skills and reinforce good practices in class design, modularity, and console interaction.

---

Enjoy your pizza math! 🍕