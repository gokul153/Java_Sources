package com.acabes.assignment.gokulassignment.Sept29.linkedList;

public class LinkedList {
    Node head;                             //Refer First node


    public LinkedList() {
        head = null;                        //Create Empty List
    }
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public void insertAtEnd(int data){
        Node current = head;
        Node newNode=new Node(data);
        if(current==null){
           head=newNode ;
        }else {
            while (current.next != null) {

                current = current.next;
            }

            current.next = newNode;
        }
    }
}
