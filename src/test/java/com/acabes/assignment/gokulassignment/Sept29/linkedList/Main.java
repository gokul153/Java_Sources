package com.acabes.assignment.gokulassignment.Sept29.linkedList;

public class Main {
    public static void main(String[] args){
        LinkedList  lin =new LinkedList();
        lin.insertAtBeginning(25);
        lin.insertAtBeginning(35);
        lin.display();
        System.out.println("Trying to insert at end");
        lin.insertAtEnd(100);
        lin.display();
    }
}
