package com.pluralsight.calcengine;

public class Multiplier extends CalculatorBase {
    public Multiplier(){

    }
    public Multiplier (double n1, double n2){
        super(n1,n2);
    }

    @Override
    public void calculate(){
            double result = getValor1() * getValor2();
            setResultado(result);

    }
}
