package com.java;


public class index2 {

    public static int bol(int a , int b ){


        int give  = a/b;
        return give;
    }

    public static void main(String[] args) {
        try {
            int num1 = 5;
            int num2 = 0;
            int result = bol(num1,num2);
            System.out.println(result);
        }catch (ArithmeticException e){
            System.out.println("Maths error");
        }
    }

}
