package com.pluralsight.calcengine;

public interface MathProcessing {

	String SEPARATOR = " ";

    // métodos
    String getKeyword(); // add
    char getSymbol(); // +
    double doCalculation (double leftVal, double rightVal);

}
