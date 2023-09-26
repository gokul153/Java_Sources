package com.acabes.assignment.gokulassignment;

abstract class Animals {
    abstract void cats();

    abstract void dogs();
}

class Cats extends Animals {
    public void cats() {
        System.out.println("Cats Meow");
    }

    void dogs() {
    }
}

class Dogs extends Animals {
    void dogs() {
        System.out.println("Dogs Bark");
    }

    void cats() {

    }
}

public class AbstractClassWork {
    public static void main(String[] args) {
        Dogs dg = new Dogs();
        Cats ct = new Cats();
        dg.dogs();
        ct.cats();
    }
}
