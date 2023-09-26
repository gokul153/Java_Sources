package com.acabes.assignment.gokulassignment.Sept26;
abstract class MyAbstracted{
    abstract void a_method();
    MyAbstracted(){
        System.out.println("This is the constructor of Abstract class");
    }
    void non_Abstract(){
        System.out.println("This is a normal method of abstract class");
    }
}
class Subclass extends MyAbstracted{
    void a_method(){
        System.out.println("This is an abstract method");
    }
}
public class Abstract_class2 {
    public static void main(String[] args) {
        Subclass sb = new Subclass();
        sb.a_method();
        sb.non_Abstract();

    }

}
