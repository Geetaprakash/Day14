import java.util.*;
import java.util.LinkedList;  
public class LinkedListInsert{    
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
            //If list is empty, both head and tail will point to new node    
            head = newNode;    
            tail = newNode;    
        }    
        else {    
            //newNode will be added after tail such that tail's next will point to newNode    
            tail.next = newNode;    
            //newNode will become new tail of the list    
            tail = newNode;    
        }    
    }    
//insert a elements 
public void insertFirst(int data){
	Node node1 = new Node();
	node1.data = data;
	node1.next = null;
	Node n = head;
       }
//display all nodes   
    public void display() {    
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
            
        LinkedListUC2 LinkedList = new LinkedListUC2();      
        LinkedList.addNode(56);    
        LinkedList.addNode(30);    
        LinkedList.addNode(70);

        LinkedList.insertFirst(40);
	LinkedList.display();
System.out.println(LinkedList);         
}  
}