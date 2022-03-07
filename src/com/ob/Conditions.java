package com.ob;

public class Conditions {
    public static void main(String[] args) {
        boolean data = true;
        int a = 15;
        int b = 20;
        if(data && a > b){
            System.out.println("True");
        } else if(data || a > b){
            System.out.println("second option");
        }
        else {
            System.out.println("False");
        }

    }
}
