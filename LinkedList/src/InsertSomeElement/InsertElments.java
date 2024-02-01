package InsertSomeElement;

import java.util.LinkedList;

public class InsertElments {
    public static void main(String[] args) {
        LinkedList obj = new LinkedList<>();
        obj.add("Red");
        obj.add("Green");
        obj.add("Black");
        obj.add("Yellow");
        System.out.println("The linked list : " + obj);
        obj.add(1, "White");
        obj.add(2, "Pink");

        System.out.println("The linked list After new elements : " + obj);
    }
}