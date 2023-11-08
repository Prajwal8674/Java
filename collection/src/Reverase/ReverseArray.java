package Reverase;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArray {
    public static void main(String[] args)
    {
        ArrayList obj= new ArrayList<>();
        obj.add("Red");
        obj.add("Green");
        obj.add("Orange");
        obj.add("White");
        obj.add("Black");
        System.out.println("Before Reversing :");
        System.out.println(obj);
        System.out.println("After Reversing :");
        Collections.reverse(obj);
        System.out.println(obj);


    }
}
