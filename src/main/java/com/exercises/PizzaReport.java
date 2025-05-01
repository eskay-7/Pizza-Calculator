package com.exercises;

public class PizzaReport {
    private PizzaCalculator pizzaCalculator;

    public PizzaReport(PizzaCalculator pizzaCalc) {
        this.pizzaCalculator = pizzaCalc;
    }

    public void display() {
        int numOfPiecesPerPerson = pizzaCalculator.getNumOfPiecesPerPerson();
        int leftOvers = pizzaCalculator.getLeftOvers();

        String pieceOrPieces = (numOfPiecesPerPerson <= 1) ? "piece" : "pieces";
        String leftOverOrLeftOvers = (leftOvers <= 1) ? "leftover" : "leftovers";

        System.out.printf("Each person gets %d %s of pizza\n", numOfPiecesPerPerson, pieceOrPieces);
        System.out.printf("LEFTOVERS: %d %s\n", leftOvers, leftOverOrLeftOvers);
    }
}
