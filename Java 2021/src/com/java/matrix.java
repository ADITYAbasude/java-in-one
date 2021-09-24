package com.java;

import java.util.Scanner;

public class matrix {


    public matrix() {
    }

    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        System.out.println("Solve your matrix question");
        System.out.println("Which type of matrix you want to solve");
        System.out.println("If you Want addition press 1\nIf you Want substraction press 2\nIf you Want multiply press 3");

        while (true) {
            while (true) {
                int var2 = var1.nextInt();
                int var3;
                int var4;
                int var5;
                int var6;
                int var8;
                int var9;
                int var10;
                int var11;
                if (var2 == 1) {
                    System.out.println("Your are choice a addition");
                    System.out.println("Enter your matrix A:");
                    System.out.println("Enter your A matrix 1st row");
                    var3 = var1.nextInt();
                    var4 = var1.nextInt();
                    System.out.println("Enter your A matrix 2nd row");
                    var5 = var1.nextInt();
                    var6 = var1.nextInt();
                    System.out.println("Enter your matrix B:");
                    new Scanner(System.in);
                    System.out.println("Enter your A matrix 1st row");
                    var8 = var1.nextInt();
                    var9 = var1.nextInt();
                    System.out.println("Enter your A matrix 2nd row");
                    var10 = var1.nextInt();
                    var11 = var1.nextInt();
                    System.out.print(var3 + var8);
                    System.out.print("  ");
                    System.out.println(var4 + var9);
                    System.out.print(var5 + var6);
                    System.out.print("  ");
                    System.out.println(var10 + var11);
                } else if (var2 == 2) {
                    System.out.println("Your are choice a addition");
                    System.out.println("Enter your matrix A: ");
                    System.out.println("Enter your A matrix 1st row");
                    var3 = var1.nextInt();
                    var4 = var1.nextInt();
                    System.out.println("Enter your A matrix 2nd row");
                    var5 = var1.nextInt();
                    var6 = var1.nextInt();
                    System.out.println("Enter your matrix B:");
                    new Scanner(System.in);
                    System.out.println("Enter your A matrix 1st row");
                    var8 = var1.nextInt();
                    var9 = var1.nextInt();
                    System.out.println("Enter your A matrix 2nd row");
                    var10 = var1.nextInt();
                    var11 = var1.nextInt();
                    System.out.print(var3 - var8);
                    System.out.print("  ");
                    System.out.println(var4 - var9);
                    System.out.print(var5 - var6);
                    System.out.print("  ");
                    System.out.println(var10 - var11);
                } else if (var2 == 3) {
                    System.out.println("Your are choice a multiply");
                    System.out.println("Enter your matrix A: ");
                    System.out.println("Enter your A matrix 1st row");
                    var3 = var1.nextInt();
                    var4 = var1.nextInt();
                    System.out.println("Enter your A matrix 2nd row");
                    var5 = var1.nextInt();
                    var6 = var1.nextInt();
                    System.out.println("Enter your matrix B:");
                    new Scanner(System.in);
                    System.out.println("Enter your A matrix 1st row");
                    var8 = var1.nextInt();
                    var9 = var1.nextInt();
                    System.out.println("Enter your A matrix 2nd row");
                    var10 = var1.nextInt();
                    var11 = var1.nextInt();
                    System.out.print(var3 * var8);
                    System.out.print("  ");
                    System.out.println(var4 * var9);
                    System.out.print(var5 * var6);
                    System.out.print("  ");
                    System.out.println(var10 * var11);
                } else if (var2 != 1) {
                    System.out.print("Sorry! You are typed invelied number ");
                } else {
                    System.out.println("Plase enter correct number");
                }
            }
        }
    }

}
