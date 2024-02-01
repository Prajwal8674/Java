package getFirstAndLastElement;

import java.util.LinkedList;

public class GetElements {
    public static void main(String[] args) {
        LinkedList obj = new LinkedList<>();
        obj.add("Red");
        obj.add("Green");
        obj.add("Black");
        obj.add("White");
        obj.add("Pink");
        obj.add("Yellow");
        System.out.println("The linked list : " + obj);

        System.out.println("First element : " + obj.getFirst());
        System.out.println("Last element : " + obj.getLast());
    }
    }
