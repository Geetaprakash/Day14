import java.util.*;
import java.util.LinkedList;  
public class LinkedListUC1{  
 public static void main(String args[]){  
  
  LinkedList<Integer> al=new LinkedList<Integer>();  
  al.add(56);  
  al.add(30);  
  al.add(70); 
  
  Iterator<Integer> itr=al.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
 }  
} 