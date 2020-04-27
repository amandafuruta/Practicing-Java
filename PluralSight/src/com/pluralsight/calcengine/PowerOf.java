package com.pluralsight.calcengine;

/**
 * Duas maneiras de fazer
 */

public class PowerOf /*extends CalculatorBase*/ implements MathProcessing{
    public PowerOf(){ }

//    public PowerOf (double n1, double n2){
//        super (n1, n2);
//    }
//
//    @Override
//    public void calculate() {
//        double resultado = Math.pow(getValor1(), getValor2());
//        setResultado(resultado);
//    }

    @Override
    public String getKeyword() {
        return "power";
    }

    @Override
    public char getSymbol() {
        return '^';
    }

    @Override
    public double doCalculation(double leftVal, double rightVal) {
//        setValor1(leftVal);
//        setValor2(rightVal);
//        calculate();
//        return getResultado();
        return Math.pow(leftVal, rightVal);
    }
}