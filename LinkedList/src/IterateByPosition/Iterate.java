package IterateByPosition;

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

        System.out.println("The linked list : " + obj);
        ListIterator i = obj.listIterator(1);
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
}
}

