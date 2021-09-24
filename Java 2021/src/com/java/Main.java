package com.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        do {


            Scanner scan = new Scanner(System.in);
            int a = scan.nextInt();
            int b = scan.nextInt();

            try {
                System.out.println( a / b);

            } catch (Exception e) {
                System.out.println("Maths error");
                System.out.println(e);
            }
        } while (true);

    }
}
