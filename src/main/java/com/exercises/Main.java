package com.exercises;

import com.utilities.Console;

public class Main {
    public static void main(String[] args) {
        int numOfPeople = Console.readNumber("Enter number of people: ", 1, 100);
        int numOfPizza = Console.readNumber("Enter number of pizzas: ", 1, 30);
        int numOfSlicesPerPizza = Console.readNumber("Enter number of slices per pizza: ", 2, 12);

        var pizzaCalc = new PizzaCalculator(numOfPeople,numOfPizza,numOfSlicesPerPizza);
        var pizzaReport = new PizzaReport(pizzaCalc);
        pizzaReport.display();
    }
}