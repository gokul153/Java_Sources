package com.acabes.assignment.gokulassignment.Sept26;
abstract  class Instruments{
    public abstract void tunning();
    public abstract void playing();
}
class Violin extends Instruments{
    public void tunning(){
        System.out.println("Violin is being tuned");
    }
    public void playing(){
        System.out.println("Violin is playing");
    }
}
class Guitar extends Instruments{
   public void tunning(){
        System.out.println("Guitar is being tuned");
    }
    public void playing(){
        System.out.println("Guitar  is being playing");
    }
}
public class Musical_instruments {
    public static void main(String[] args) {
        Instruments Guitar = new Guitar();
        Instruments Violin = new Violin();
        Guitar.playing();
        Guitar.tunning();
        Violin.playing();
        Violin.tunning();
    }
}
