package com.ob;

public class SuperCharger {
    public static void main(String[] args) {
        naranja();
        naranja(5);
        naranja("Bolivia");
        naranja("Grande", "dulce" );
    }
    public static void naranja(){
        System.out.println("Naranja");
    }

    public static void naranja(int num){
        System.out.println(num + " Naranja");
    }

    public static void naranja(String origen){
        System.out.println("Naranja de " + origen);
    }

    public static void naranja(String tamano, String sabor){
        System.out.println("Naranja " + tamano);
    }

}
