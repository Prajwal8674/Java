package JoinTwoArrayList;

import java.util.ArrayList;

public class Join {
    public static void main(String[] args) {
        ArrayList al = new ArrayList<>();
        ArrayList al2 = new ArrayList<>();

        al.add("red");
        al.add("green");
        al.add("orange");
        al.add("white");
        al.add("black");

        al2.add("red");
        al2.add("green");
        al2.add("black");
        al2.add("Pink");

        System.out.println("List Of First Array : "+al);
        System.out.println("List Of Second Array : "+al2);
al.addAll(al2);
        System.out.println("New Array : "+al);
    }
}
