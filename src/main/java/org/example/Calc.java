package org.example;

public class Calc {

    public int summation(int a, int b) {
        int result = a + b;
        System.out.printf("Sum of %d and %d equals %d\n", a, b, result);
        return result;
    }

    public int subtraction(int a, int b) {
        int result = a - b;
        System.out.printf("Difference between %d and %d equals %d\n", a, b, result);
        return result;
    }

}
