package com.ob;

public class LoopFor {
    public static void main(String[] args) {
        int a = 2;
        for(int i = 0; i < 10; i++){
            System.out.println(i + " Loop for");
            int res = i % a;
            if(res == 0){
                System.out.println("pair");
            } else {
                System.out.println("Odd");
            }
        }
    }

}
