package com.java;

import java.util.Scanner;

public class index {


    public static void main(String[] args) {

        System.out.println("Enter your total marks");
        Scanner scan = new Scanner(System.in);
        float b = scan.nextFloat();
        System.out.println("It is Your marks " + b);
        System.out.println("And your percentage");

        System.out.println(b * 100 / 500 + "%");

    }


}
