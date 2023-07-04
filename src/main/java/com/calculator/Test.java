package com.calculator;

public class Test {

    public static void main(String[] args) {

        /*MathOperation add = (a, b) ->  a+b;
        System.out.println("Addition :: " + calculate(5, add, 2));
        MathOperation substract = (a,b) -> a-b;
        System.out.println("Substraction :: " + calculate(substract));
        MathOperation multiply = (a, b) ->  a*b;
        System.out.println("Multiplication :: " + calculate(multiply));
        MathOperation divide = (a,b) -> a/b;
        System.out.println("Division :: " + calculate(divide));*/

        MathOperation add = (a, b) ->  a+b;
        MathOperation substract = (a,b) -> a-b;
        MathOperation multiply = (a, b) ->  a*b;
        MathOperation divide = (a,b) -> a/b;
        int onscreenNubmer = 0;
        onscreenNubmer = calculate(5, add, 2);
        onscreenNubmer = calculate(onscreenNubmer, substract, 3);
        onscreenNubmer = calculate(onscreenNubmer, multiply, 7);
        onscreenNubmer = calculate(onscreenNubmer, add, 2);
        onscreenNubmer = calculate(onscreenNubmer, divide, 3);

        System.out.println("Result :: " + onscreenNubmer);


    }

    /*public static int calculate(MathOperation op){
        int a = 100;
        int b = 5;
        return op.operate(a,b);
    }*/

    public static int calculate(int onscreenNumber, MathOperation op, int enterdNumber){
        return op.operate(onscreenNumber,enterdNumber);
    }
}
