package com.ob;

// from here, we can call others functions, but...
// 1 - it need to be public

public class AmbitoFunciones {
    public static void main(String[] args) {
        newPrint("Dana Chiara");
    }

    private static void newPrint(String name) {
        Functions.print(name);
    }
}

