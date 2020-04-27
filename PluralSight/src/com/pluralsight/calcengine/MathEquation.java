package com.pluralsight.calcengine;

public class MathEquation {
    private double leftVal;
    private double rightVal;
    private char opCode;
    private double result;

    // PODE TER MAIS DE UM METODO CONSTRUTOR
    public MathEquation(){
        // MÉTODO 1- MÉTODO VAZIO
    }
    public MathEquation (char opCode){
        // MÉTODO 2
        this.opCode = opCode;
    }
    public MathEquation (char opCode, double leftVal, double rightVal){
        // MÉTODO 3- A ORDEM DOS ELEMENTOS DEVE SER SEGUIDA
        this(opCode);  // USA O MÉTODO 2
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }


    public void setLeftVal (double leftVal){
        this.leftVal = leftVal;
    }
    public double getLeftVal(){
        return leftVal;
    }
    public void setRightVal (double rightVal){
        this.rightVal = rightVal;
    }
    public double getRightVal(){
        return  rightVal;
    }
    public void setOpCode (char opCode){
        this.opCode = opCode;
    }
    public char getOpCode(){
        return opCode;
    }
    public double getResult(){
        return result;
    }


    public void execute(){
        switch(opCode){
            case 'a':
                result = leftVal + rightVal;
                break;
            case 's':
                result = leftVal - rightVal;
                break;
            case 'd':
                result = rightVal != 0? leftVal/rightVal : 0.0d;
                break;
            case  'm':
                result = leftVal * rightVal;
                break;
            default:
                System.out.println ("ERROR");
                result = 0.0d;
        }
    }
}

