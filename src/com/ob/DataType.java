package com.ob;

public class DataType {
    public static void main(String[] args) {
        // var define
        // type - identify - value
        // int num = 3
        // int num1
        // num = 5

        // Integrate numbers
        // all of this can't be null
        byte num1 = 122; // 1 byte / from -127 to 128 or 0 to 255
        short num2 = 500; // 2 byte / from - 15000 to 15000 or 0 to 35636
        int num3 = 1255; // 4 byte / real big int
        long num4 = 20000; // 8 byte / extreme real big int

        // Float numbers
        float num5 = 14.2f; // 1 position for dot decimal
        double num6 = 22.25d; // 2 position for dot decimals

        // booleans
        boolean bool0 = false;
        boolean bool1 = true;

        // character
        // char letter = "a"; // I can't use char, it makes an error

        // string Class
        String expression = "it is a long expression"; // it's part String's class

        // integer class
        // this class is for involved int to won't be null
        Integer num7 = null; // it can be null
        Long num8 = 8L; // it can be null too - we most use "L" letter after number


        // Print place
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);
        System.out.println(bool0);
        System.out.println(bool1);
        System.out.println(expression);
        System.out.println(num7);
        System.out.println(num8);
    }
}
