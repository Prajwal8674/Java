import java.util.*;
class LinkedListDemo{
public static void main(String args[]){
LinkedList l = new LinkedList();
l.add("Manish");
l.add("23");
l.add(null);
l.add("Manish");
System.out.println(l);
l.set(1,"Neo");
System.out.println(l);
//l.set(1,"Slution");
l.removeLast();
System.out.println(l);
l.addFirst("Linked List");
System.out.println(l);
System.out.println(l.getFirst());
}
}