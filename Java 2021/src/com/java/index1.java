package com.java;

class myException extends Exception {
    @Override
    public String toString() {
        return super.toString() + "i am two String";
    }

    @Override
    public String getMessage() {
        return super.getMessage() + "get msg";
    }
}


public class index1 {
    public static void main(String[] args) {
        int a = 0;
        if (a < 99) {
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
            }
        }
    }
}
