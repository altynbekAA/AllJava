package linkedList;

import java.util.Stack;

public class StackEx {
 public static void main(String[] args) {
	  //Last in first out
	 
	 Stack <String> stack = new Stack<>();
	 stack.push("java");
	 stack.push("OCA");
	 stack.push("10X");
	 stack.push("Selenium Cookbook");
	 
	 System.out.println(stack.peek());
	 System.out.println(stack);
	 
	 System.out.println(stack.search("java"));
	 



	 
}
}
