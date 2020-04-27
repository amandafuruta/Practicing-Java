package com.pluralsight.calcengine;

public class Adder extends CalculatorBase implements MathProcessing {
    public Adder(){

    }
    public Adder (double n1, double n2){
        super(n1,n2);
    }

    @Override
    public void calculate (){
        double result = getValor1() + getValor2();
        setResultado(result);
    }

    @Override
    public String getKeyword() {
        return "add";
    }

    @Override
    public char getSymbol() {
        return '+';
    }

    @Override
    public double doCalculation(double leftVal, double rightVal) {
        setValor1(leftVal);
        setValor2(rightVal);
        calculate();
        return getResultado();
    }
}
