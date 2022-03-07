package com.ob;

public class LoopsWhile {
    public static void main(String[] args) {
        int count = 0;
        while(count < 10){
            count ++;
            if(count == 6){
                continue;
            }
            if(count == 10){
                System.out.println(count + " es igual a 10");
            } else {
                System.out.println(count + " menor que 10");

            }

        }

    }
}
