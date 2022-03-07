package com.competition;

public class Main {
    public static void main(String[] args) {
        Person dana = new Runner("dana", 25, "argentina", "De los filos");
        System.out.println(dana.name);
        System.out.println(((Runner)dana).eventName);
        dana.setMessage("First msn");
        System.out.println(dana.message);
        dana.setMessage("Second msg");
        System.out.println(dana.message);
        System.out.println(dana.message);
        Person lean = new Runner("lean",39, "argentina","el cruce de los andes");
        System.out.println(lean);
        System.out.println(lean.name);
        System.out.println(((Runner) lean).eventName);
        Runner valen = new Runner("valen",22, "argentina","De los andes");
        System.out.println(valen);
        System.out.println(valen.name);
        System.out.println(valen.eventName);



    }
}
