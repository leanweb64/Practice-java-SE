package com.competition;

public class Runner extends Person{
    // attribute

    String eventName;

    // constructor

    public Runner(String name, int age, String country, String eventName){
        super(name, age, country);
        this.eventName = eventName;


    }

    // methods
    public void setEvent(String event){
        this.eventName = event;
    }

    @Override
    public String toString() {
        return "Runner{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                ", message='" + message + '\'' +
                ", eventName='" + eventName + '\'' +
                '}';
    }
}
