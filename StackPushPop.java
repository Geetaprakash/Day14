import java.util.*;  
import java.util.Stack;
public class StackPushPop{  
 
//push operation  
static void pushelmnt(Stack stack, int x)   
{        
stack.push(new Integer(x));  
System.out.println("push -> " + x);  
System.out.println("stack: " + stack);  
}   

	static void popelmnt(Stack stack)   
	{  
	System.out.print("pop -> ");    
	Integer x = (Integer) stack.pop();  
	System.out.println(x);  
	System.out.println("stack: " + stack);  
	}	  
public static void main(String args[])   
{    
	Stack <Integer> stack = new Stack<>();  
	System.out.println("stack: " + stack);  
//pushing elements into the stack  
pushelmnt(stack, 30);  
pushelmnt(stack, 56);  
pushelmnt(stack, 70);  
popelmnt(stack);  
popelmnt(stack);  
//throws exception if the stack is empty  
try   
{  
popelmnt(stack);  
}   
catch (EmptyStackException e)   
{  
System.out.println("empty stack");  
}  
}  
}  