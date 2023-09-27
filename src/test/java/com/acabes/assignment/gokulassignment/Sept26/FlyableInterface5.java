package com.acabes.assignment.gokulassignment.Sept26;
interface Flyable{
    void fly_obj();
}
class Spacecraft implements  Flyable{

    public void fly_obj() {
        System.out.println("Space_craft");
    }
}
class Airplane implements Flyable{
    public void  fly_obj(){
        System.out.println("Airplane is the object");
    }
}
class Helicopter implements  Flyable{
    public  void fly_obj(){
        System.out.println("Helicopter is the object");
    }
}
public class FlyableInterface5 {
    public static void main(String[] args){
        Spacecraft sp=new Spacecraft();
        Airplane ar= new Airplane();
        Helicopter hr=new Helicopter();
        sp.fly_obj();
        ar.fly_obj();
        hr.fly_obj();
    }
}
