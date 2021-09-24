package com.java;

import java.util.Scanner;

public class calculator {

    public static int add(int a, int b) {
        int c = a + b;
        System.out.println("Your answer is : " + c);
        return c;
    }

    public static int minus(int a, int b) {
        int c = a - b;
        System.out.println("Your answer is : " + c);
        return c;
    }

    public static int multiply(int a, int b) {
        int c = a * b;
        System.out.println("Your answer is : " + c);
        return c;
    }

    public static float divide(float a, float b) {

        float c = a / b;
        System.out.println("Your answer is : " + c);
        return c;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {

            System.out.println("add(1) , subtraction(2) , multiply(3) , divide(4)");
            int chouse = scan.nextInt();
            if (chouse == 1) {
                System.out.print("Enter your first value : ");
                int take = scan.nextInt();
                System.out.print("Enter your second value : ");
                int take1 = scan.nextInt();

                add(take, take1);
            } else if (chouse == 2) {
                System.out.print("Enter your first value : ");
                int take = scan.nextInt();
                System.out.print("Enter your second value : ");
                int take1 = scan.nextInt();

                minus(take, take1);
            } else if (chouse == 3) {
                System.out.print("Enter your first value : ");
                int take = scan.nextInt();
                System.out.print("Enter your second value : ");
                int take1 = scan.nextInt();

                multiply(take, take1);
            } else if (chouse == 4) {
                System.out.print("Enter your first value : ");
                float take = scan.nextFloat();
                System.out.print("Enter your second value : ");
                float take1 = scan.nextFloat();
                try {

                    divide(take, take1);
                } catch (ArithmeticException e) {
                    System.out.println("Maths error");
                }
            }

        }
    }
}
