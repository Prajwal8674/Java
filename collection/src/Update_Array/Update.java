package Update_Array;

import java.util.ArrayList;

public class Update {
    public static void main(String[] Args) {
        ArrayList obj = new ArrayList<>();
        obj.add("Red");
        obj.add("Green");
        obj.add("Orange");
        obj.add("White");
        obj.add("Black");
        System.out.println(obj);

        obj.remove(2);
        obj.add(2,"Yellow");
        System.out.println(obj);
    }
}
