package com.pluralsight.myapp;

//Single import type
import com.pluralsight.calcengine.Adder;
import com.pluralsight.calcengine.CalculateHelp;
import com.pluralsight.calcengine.CalculatorBase;
import com.pluralsight.calcengine.Divider;
import com.pluralsight.calcengine.DynamicHelper;
import com.pluralsight.calcengine.InvalidStatementException;
import com.pluralsight.calcengine.MathEquation;
import com.pluralsight.calcengine.MathProcessing;
import com.pluralsight.calcengine.Multiplier;
import com.pluralsight.calcengine.PowerOf;
import com.pluralsight.calcengine.Subtracter;

//Import on Demand
//import com.pluralsight.calcengine.*;

public class Main {
 public static void main (String[] args){
     // useCalculateHelp();

     String[] statements = {
             "add 25.0 92.0",        // 25.0 + 92.0 = 117.0
             "power 5.0 2.0"         // 5.0 ^ 2.0 = 25.0
     };
     DynamicHelper helper = new DynamicHelper(new MathProcessing[]{
             new Adder(),
             new PowerOf()
     });

     for (String statement : statements){
         String output = helper.process(statement);
         System.out.println(output);
     }


 }

 static void useCalculateHelp(){
     MathEquation[] equations = new MathEquation[4];
     equations[0] = new MathEquation ('d', 100.0d, 50.0d);
     equations[1] = new MathEquation ('a',25.0d, 92.0d);
     equations[2] = new MathEquation ('s', 225.0d, 17.0d);
     equations[3] = new MathEquation ('m', 11.0d, 3.0d);

     for (MathEquation equation: equations){
         equation.execute();
         System.out.println("Result: "+ equation.getResult());
     }


     // CTRL + / para comentar o bloco
// public static MathEquation create(double leftVal, double rightVal, char opCode){
//     MathEquation equation = new MathEquation();
//     equation.setRightVal(rightVal);
//     equation.setLeftVal(leftVal);
//     equation.setOpCode(opCode);
//
//     return equation;
// }

     // usando extends
     System.out.println("___________USANDO EXTENDS_______________");
     CalculatorBase[] calculos = {
             new Adder(10.5d, 10.5d),
             new Subtracter(100.0d, 10.0d),
             new Multiplier(100.0d, 2.0d),
             new Divider(100.0d, 0.0d)
     };
     for(CalculatorBase calc: calculos){
         calc.calculate();
         System.out.println("Resultado: "+ calc.getResultado());
     }


     System.out.println("____________USANDO ENUM____________");
     String[] statment = {
             "divide 100.0 50.0 ", // 100/50 = 2
             "add 25.0 92.0",
             "subtract 225.0 17.0",
             "multiply 11.0 3.0",
             "add 1.0", // teste do Exception Customizada
             "add xx 25.0",
             "addx 0.0 0.0"
     };

     CalculateHelp helper = new CalculateHelp();
     for (String statments : statment){
         try {
             helper.process(statments);
             System.out.println(helper);
         } catch (InvalidStatementException e){
             System.out.println(e.getMessage());
             if (e.getCause() != null)
                 System.out.println("Original Exception: "+e.getCause().getMessage());
         }
     }
 }

}
