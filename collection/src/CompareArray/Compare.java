package CompareArray;

import java.util.ArrayList;
import java.util.Collections;

public class Compare {
    public static void main(String[] args)
    {
    ArrayList obj = new ArrayList<>();
        ArrayList obj2 = new ArrayList<>();
        ArrayList obj3= new ArrayList<>();

        obj.add("Red");
        obj.add("Green");
        obj.add("Orange");
        obj.add("White");
        obj.add("Black");

        obj2.add("Red");
        obj2.add("Green");
        obj2.add("Orange");
        obj2.add("Black");
        System.out.println(obj);
        System.out.println(obj2);

        for (Object data: obj)
        {
            if(obj2.contains(data))
            {
                obj3.add("Yes");
            }
            else {
                obj3.add("No");
            }
        }
        System.out.println(obj3);
    }
}
