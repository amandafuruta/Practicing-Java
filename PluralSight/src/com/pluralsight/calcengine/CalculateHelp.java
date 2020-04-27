package com.pluralsight.calcengine;

public class CalculateHelp {
    MathComand comand;
    double leftvalue;
    double rightValue;
    double result;

    // é igual ao #define em C
    private static final char ADD_SYMBOL = '+';
    private static final char SUBTRACT_SYMBOL = '-';
    private static final char MULTIPLY_SYMBOL = '*';
    private static final char DIVIDE_SYMBOL = '/';

    public void process (String statement) throws InvalidStatementException{
        // add 1.0 2.0
        String[] parts = statement.split(" "); // vai separar a string em partes

        if (parts.length != 3)
            throw new InvalidStatementException("Incorrect number of field", statement);

        String comandString = parts[0];

        try {
            leftvalue = Double.parseDouble(parts[1]); // converte a string para souble
            rightValue = Double.parseDouble(parts[2]);
        }catch (NumberFormatException e){
            throw new InvalidStatementException("Not a number", statement, e);
        }

        setComandFromString(comandString);

        if (comand == null){
            throw  new InvalidStatementException("Invalid Command", statement);
        }

        // cria uma nova variavel
        CalculatorBase calculator = null;
        switch (comand) {
            case Add:
                calculator = new Adder(leftvalue,rightValue);
                break;
            case Divide:
                calculator = new Divider(leftvalue,rightValue);
                break;
            case Multiply:
                calculator = new Multiplier(leftvalue,rightValue);
                break;
            case Subtract:
                calculator = new Subtracter(leftvalue,rightValue);
                break;
        }
        calculator.calculate();
        result = calculator.getResultado();
    }

    public void setComandFromString (String comandString){
        // add -> MathComand.Add
        // converter o enum para uma string e compara as strings:

        if (comandString.equalsIgnoreCase(MathComand.Add.toString()))
            comand = MathComand.Add;
        else if (comandString.equalsIgnoreCase(MathComand.Divide.toString()))
            comand = MathComand.Divide;
        else if (comandString.equalsIgnoreCase(MathComand.Multiply.toString()))
            comand = MathComand.Multiply;
        else if (comandString.equalsIgnoreCase(MathComand.Subtract.toString()))
            comand = MathComand.Subtract;
        else
            comand = null;

    }

    public String toString(){
        char symbol = ' ';
        switch (comand){
            case Add:
                symbol = ADD_SYMBOL;
                break;
            case Subtract:
                symbol = SUBTRACT_SYMBOL;
                break;
            case Multiply:
                symbol = MULTIPLY_SYMBOL;
                break;
            case Divide:
                symbol = DIVIDE_SYMBOL;
                break;
        }

        StringBuilder sb = new StringBuilder(20);
        sb.append(leftvalue);
        sb.append(" ");
        sb.append(symbol);
        sb.append(" ");
        sb.append(rightValue);
        sb.append(" = ");
        sb.append(result);

        return sb.toString();
    }

}
