package com.java;

import java.util.Scanner;

public class matrix_in_array {
    public static void matri() {
        int arr[][] = new int[0][0];

        for (int i = 0; i < 3; ) {
            for (int j = 0; j < 3; ) {
                System.out.print("Enter a number " + "[" + i + "]" + "" + "[" + j + "] : ");
                Scanner scan = new Scanner(System.in);
                arr[i][j] = scan.nextInt();
                j++;
            }
            i++;
        }

        for (int i = 0; i < 3 ; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }
    public static void main(String[] args) {

        matri();
    }


}
