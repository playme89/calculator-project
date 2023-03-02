package com.example.calculatorproject;

import com.example.calculatorproject.calculate.*;

import java.util.List;

public class Calculator {
    private static final List<NewArithmeticOperator> arithmeticOperators = List.of(new AdditionOperator(),new SubtractionOperator(),new MultiplicationOperator(),new DivisionOperator());

    public static int calculate(int operand1,String operator,int operand2){
        return ArithmeticOperator.calculate(operand1,operator,operand2);
    }
}
