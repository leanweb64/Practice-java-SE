package com.ob;

public class Car {
    // atributos
    String marca;
    String modelo;
    short ano;
    String color;
    short velocidad = 0;

    // constructor
    public void car(String marca, String modelo, short ano, String color, short velocidad){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.color = color;
        this.velocidad = velocidad;
    }


    // metodos
    public void acelerar(short cantidad){
        if (cantidad > 0 && cantidad < 120){
            this.velocidad = velocidad += cantidad;
        }
    }


    // toString
    @Override
    public String toString() {
        return "Car{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                ", color='" + color + '\'' +
                ", velocidad=" + velocidad +
                '}';
    }
}
