package com.company;
import jdk.internal.util.xml.impl.Input;

import java.util.*;
import java.util.LinkedList;
public class Main {


    public static class LinkedListDelF{
        class Node{
            int data;
            Node next;
           

            public Node(int data)
            {
                this.data = data;
                this.next = null;
            }
        }

        // head and tail of linked list
        public Node head = null;
        public Node tail = null;

        //add a new node to the list
        public void addNode(int data) {
            Node newNode = new Node(data);
            if(head == null) {
                
                head = newNode;
                tail = newNode;
            }
            else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        //delete first element
        public void deleteFirst(int First)
        {

            if(First == 0)
            {
                head = head.next;

            }
            else
            {
                Node n = head;
                Node n1 = null;
            }
            for(int i=0;i<First-1;i++)
            {
                n = Integer.parseInt(null);
                n1 = n.next;
                n.next = n1.next;
                System.out.println("Deleted element:" +n1.data);
            }
        }
        //display all nodes
        public void display()
        {
            //point to head
            Node current = head;

            if(head == null) {
                System.out.println("List is empty");
                return;
            }
            System.out.println("Nodes Of LinkedList: ");
            while(current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }


        public static void main(String[] args) {

            LinkedListDelF LinkedList = new LinkedListDelF();
            LinkedList.addNode(56);
            LinkedList.addNode(30);
            LinkedList.addNode(70);
            LinkedList.deleteFirst(1);
            LinkedList.display();
            System.out.println(LinkedList);
        }
    }
}
