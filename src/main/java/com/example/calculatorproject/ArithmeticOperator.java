package com.example.calculatorproject;

import lombok.AllArgsConstructor;

import java.util.Arrays;

@AllArgsConstructor
public enum ArithmeticOperator {
    ADDITION("+"){
        @Override
        public int arithmeticCalculate(int operand1, int operand2) {
            return operand1+operand2;
        }
    }, SUBTRACTION("-"){
        @Override
        public int arithmeticCalculate(int operand1, int operand2) {
            return operand1-operand2;
        }
    },MULTIPLICATION("*"){
        @Override
        public int arithmeticCalculate(int operand1, int operand2) {
            return operand1*operand2;
        }
    },DIVISION("/"){
        @Override
        public int arithmeticCalculate(int operand1, int operand2) {
            return operand1/operand2;
        }
    };

    private final String operation;

    public static int calculate(int operand1, String operator, int operand2) {
        ArithmeticOperator arithmeticOperator = Arrays.stream(values())
                .filter(v->v.operation.equals(operator))
                .findFirst()
                .orElseThrow(()->new IllegalArgumentException("올바른 사칙연산이 아닙니다"));

        return arithmeticOperator.arithmeticCalculate(operand1, operand2);
    }

    public abstract int arithmeticCalculate(final int operand1,final int operand2);
}
