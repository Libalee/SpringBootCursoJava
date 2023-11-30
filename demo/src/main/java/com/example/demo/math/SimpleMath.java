package com.example.demo.math;

public class SimpleMath {

    public static Double sum(Double numberOne, Double numberTwo) {
        return numberOne + numberTwo;
    }

    public static Double sub(Double numberOne, Double numberTwo) {
        return numberOne - numberTwo;
    }

    public static Double div(Double numberOne, Double numberTwo) {
        return numberOne / numberTwo;
    }

    public static Double mul(Double numberOne, Double numberTwo) {
        return numberOne * numberTwo;
    }

    public static Double avg(Double numberOne, Double numberTwo) {
        return (numberOne + numberTwo) / 2;
    }

    public static Double sqrt(Double number) {
        return Math.sqrt(number);
    }
}
