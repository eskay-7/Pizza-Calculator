package com.exercises;

public class PizzaCalculator {
    private int numOfPeople;
    private int numOfPizza;
    private int numOfSlicesPerPizza;

    public PizzaCalculator(int numOfPeople, int numOfPizza, int numOfSlicesPerPerson) {
        this.numOfPeople = validteFieldRange(numOfPeople,1,100);
        this.numOfPizza = validteFieldRange(numOfPizza,1,30);
        this.numOfSlicesPerPizza = validteFieldRange(numOfSlicesPerPerson,2,12);
    }

    private int getTotalPiecesOfPizza() {
        return numOfSlicesPerPizza * numOfPizza;
    }

    public int getNumOfPiecesPerPerson() {
        return getTotalPiecesOfPizza() / numOfPeople;
    }

    public int getLeftOvers() {
        return getTotalPiecesOfPizza() % numOfPeople;
    }

    private int validteFieldRange(int data, int min, int max) {
        if(data < min || data > max)
            throw new IllegalArgumentException(String.format("ERROR, enter a value between %d and %d", min, max));
        return data;
    }
}
