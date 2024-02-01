package IterateElements;

import java.util.LinkedList;
import java.util.ListIterator;

public class Iterate {
    public static void main(String[] args) {
        LinkedList obj = new LinkedList<>();
        obj.add("Red");
        obj.add("Green");
        obj.add("Black");
        obj.add("White");
        obj.add("Pink");
        obj.add("Yellow");
        System.out.println("The linked list : " + obj);
        ListIterator i = obj.listIterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}