package com.java;

import java.util.Scanner;

public class aditya {


    public static void main(String[] args) {
        System.out.println("Kilometer convert into mile machine.");
        System.out.println("Enter a kilometer");
        Scanner number = new Scanner(System.in);
        int i = number.nextInt();
        System.out.print(i * 0.621371f + (" mile"));
    }
}
