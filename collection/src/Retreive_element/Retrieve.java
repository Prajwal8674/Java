package Retreive_element;

import java.util.ArrayList;

public class Retrieve {
    public static void main(String[] Args)
    {
        ArrayList obj = new ArrayList<>();
        obj.add("Red");
        obj.add("Green");
        obj.add("Orange");
        obj.add("White");
        obj.add("Black");
        System.out.println(obj);
        System.out.println("First  Element : "+obj.get(0));
        System.out.println(" Third Element : "+obj.get(2));




    }
}
