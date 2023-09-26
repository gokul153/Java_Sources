package com.acabes.assignment.gokulassignment.Sept26;
abstract class Shapes{
    int length,width;
    String name;
    Shapes(String name){
        this.name=name;

    }
    void move(int x,int y){
        System.out.println("Values of "+name+"is ::"+x+" "+y);
        System.out.println(length+"width:"+width);

    }
    void draw(){
        System.out.println("Drawing Function");
    }
    void area(int x,int y ){
        int area = x*y;
        System.out.println(area);
    }
}
class Rectangle extends Shapes{
    Rectangle(String name){
        super(name);
    }
    void draw(){
        System.out.println("I am Rectangle");
    }
    void area(int length,int width){
        int area = length*width;
        System.out.println("Rectangle Area is"+area);
    }
}
class Circle extends Shapes{
    Circle(){
        super("circle");
    }
    void draw(){
        System.out.println("I am Circle");
    }
    void area(int radious,int not){
        double area=3.14*radious*radious;
        System.out.println("Area of circle is "+area);
    }
}
public class AbstractShapes3{
    public static void main(String[] args) {
        Shapes c = new Circle();
        Shapes r = new Rectangle("Rectangle");
        c.move(4,6);

        c.draw();
        r.draw();
        c.area(5,0);
        r.area(10,15);

    }
}