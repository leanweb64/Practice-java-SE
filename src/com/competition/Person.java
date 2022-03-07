package com.competition;

public abstract class Person {
    // attribute

    String name;
    int age;
    String country;
    String message;

    // constructor

    public  Person(String name, int age, String country){
        this.name = name;
        this.age = age;
        this.country = country;

    }

    // methods

    public String getName(){
        return name;
    }

    public void setMessage(String msn){
        this.message = msn;

    };

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                '}';
    }
}
