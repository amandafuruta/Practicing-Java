package com.pluralsight.calcengine;

public class Divider extends CalculatorBase {
    public Divider(){

    }
    public Divider (double n1, double n2){
        super(n1, n2);
    }

    @Override
    public void calculate(){
        if(getValor2() == 0)
            setResultado(00.0d);
        else{
            double result = getValor1()/getValor2();
            setResultado(result);
        }
    }
}
