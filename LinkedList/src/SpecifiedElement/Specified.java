package SpecifiedElement;

import java.util.LinkedList;

public class Specified {
    public static void main(String[] args) {
        LinkedList obj = new LinkedList<>();
        obj.add("Red");
        obj.add("Green");
        obj.add("Black");
        obj.add("Pink");
        obj.add("Yellow");
        System.out.println("The linked list : " + obj);
        obj.add(0, "Pink");
        System.out.println("The linked list After new element: " + obj);
    }
}