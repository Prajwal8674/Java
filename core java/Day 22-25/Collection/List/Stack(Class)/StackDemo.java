import java.util.*;
class StackDemo{
	public static void main(String args[]){
		Stack s = new Stack();
		s.push("A");
		s.push("B");
		s.push("C");
		System.out.print(s);
		System.out.println();
		
		System.out.println(s.search("A"));
		System.out.println(s.search("Z"));
		
	}
}