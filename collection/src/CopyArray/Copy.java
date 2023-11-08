package CopyArray;

import java.util.ArrayList;
import java.util.Collections;

public class Copy {
    public static void main(String[] Args) {
        ArrayList obj1 = new ArrayList<>();
    ArrayList obj2=new ArrayList<>();
        obj1.add(1);
        obj1.add(2);
        obj1.add(3);
        obj1.add(4);
        System.out.println("List 1 :"+obj1);
        obj2.add("A");
        obj2.add("B");
        obj2.add("C");
        obj2.add("D");

        System.out.println("List 2 :"+obj2);
        Collections.copy(obj1,obj2);
        System.out.println("After copy : ");
        System.out.println("List 1 :"+obj1);
        System.out.println("List 2 :"+obj2);




    }

    }
