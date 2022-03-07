package com.ob;

public class Functions {
    public static void main(String[] args) {
        saludo("Leandro Ariel");
        int x = suma(15,13);
        System.out.println(x);
    }

    public static void print(String name){
        System.out.println("Hello "+ name);
    }

    private static void saludo(String name){
        print(name);
    }

    private static int suma(int a, int b){
        int res = a + b;
        return res;
    }

}

