package RemoveElement;

import java.util.ArrayList;

public class Remove {
    public static void main(String[] Args) {
        ArrayList obj = new ArrayList<>();
        obj.add("Red");
        obj.add("Green");
        obj.add("Orange");
        obj.add("White");
        obj.add("Black");
        System.out.println(obj);
        obj.remove(2);
        System.out.println("After Removing Third element from arraylist : ");
        System.out.println(obj);

    }
}