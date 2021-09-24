package com.java;

import java.util.Scanner;

public class table {
    public static void table(int num_2){
        int sum;
        for (int i = 0; i <= 10 ; i++){
            sum = num_2*i;
            System.out.println(num_2+" x "+i+" = "+sum);
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        Scanner scan = new Scanner(System.in);
        int take_num = scan.nextInt();
        table(take_num);


    }
}
