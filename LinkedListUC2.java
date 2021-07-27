import java.util.*;
import java.util.LinkedList;  
public class LinkedListUC2{    
 class Node{    
        int Data;    
        Node Next;    
            
        public Node(int Data) 
	{    
            this.Data = Data;    
            this.Next = null;    
        }    
    }    
     
    // head and tail of linked list    
    public Node head = null;    
    public Node tail = null;    
        
    //add a new node to the list    
    public void addNode(int Data) {     
        Node newNode = new Node(Data);      
        if(head == null) {      
            head = newNode;    
            tail = newNode;    
        }    
        else {    
                
            tail.Next = newNode;    
            //newNode will become new tail of the list    
            tail = newNode;    
        }    
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
            System.out.print(current.Data + " ");    
            current = current.Next;    
        }    
        System.out.println();    
    }    
        
    public static void main(String[] args) {    
            
        LinkedListUC2 LinkedList = new LinkedListUC2();      
        LinkedList.addNode(56);    
        LinkedList.addNode(30);    
        LinkedList.addNode(70);
	LinkedList.display();
	System.out.println(LinkedList);         
	}  
}