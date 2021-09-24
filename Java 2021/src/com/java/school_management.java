package com.java;

import java.util.Scanner;

public class school_management {
    public static void main(String[] args) {
        System.out.println("Welcome to school management system");
        System.out.println("what you wont to change");
        System.out.println("(1) Students." + "(2) Teacher." + "(3) Library.");

        Scanner take_number = new Scanner(System.in);
        System.out.print("Select your choice : ");
        int num1 = take_number.nextInt();
        int retur;


        if (num1 == 1) {
            System.out.println("(1) for add student name." + "(2) change student information." + "(3) see the students name and information.");
            System.out.print("Select your choice : ");

            int student_num = take_number.nextInt();
            if (student_num == 1) {
                do {


                    int i;
                    int n;
                    try {
                        System.out.println("Enter how many string you want to print : ");
                        i = take_number.nextInt();
                        String[] arr = new String[i];
                        for (n = 0; n < arr.length; n++) {
                            System.out.print("Enter the name : ");
                            arr[n] = take_number.nextLine();
                            System.out.println(arr[n]);

                        }
                        System.out.println("thanks for adding a student name.");
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    System.out.println("write a 1 to repeat this step again and write a 2 to continue : ");
                    retur = take_number.nextInt();
                } while (retur == 1);
            }


            System.out.println("(1) for add student name." + "(2) change student information." + "(3) see the students name and information.");
            System.out.print("Select your choice : ");

            student_num = take_number.nextInt();


//            student 2
            do {


                if (student_num == 2) {

                    int i;
                    int n;
                    try {
                        System.out.println("Enter how many string you want to print : ");
                        i = take_number.nextInt();
                        String[] arr = new String[i];
                        for (n = 0; n < arr.length; n++) {
                            System.out.println("Enter the name : ");
                            arr[n] = take_number.next();
                            System.out.println(arr[n]);

                        }
                        System.out.println("thanks for adding a student name.");
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
                System.out.println("write a 1 to repeat this step again and write a 2 to continue : ");
                retur = take_number.nextInt();
            } while (retur == 1);


        }
        System.out.println("done");
    }


}


