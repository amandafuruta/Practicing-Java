package com.pluralsight.calcengine;

public  abstract class CalculatorBase {
    private double valor1;
    private double valor2;
    private double resultado;

    public CalculatorBase(){

    }
    public CalculatorBase (double valor1, double valor2){
        this.valor1 = valor1;
        this.valor2 = valor2;
    }


    public void setValor1 (double valor1){
        this.valor1 = valor1;
    }
    public double getValor1(){
        return  valor1;
    }
    public void setValor2 (double valor2){
        this.valor2 = valor2;
    }
    public double getValor2(){
        return valor2;
    }
    public void setResultado (double resultado){
        this.resultado = resultado;
    }
    public double getResultado(){
        return resultado;
    }

    public abstract void calculate();
}
