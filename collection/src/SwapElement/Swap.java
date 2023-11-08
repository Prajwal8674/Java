package SwapElement;

import java.util.ArrayList;
import java.util.Collections;

public class Swap {
    public static void main(String[] args)
    {
        ArrayList obj= new ArrayList<>();
        obj.add("Red");
        obj.add("Green");
        obj.add("Black");
        obj.add("White");
        obj.add("Pink");

        for(Object data :obj)
        {
            System.out.println(data);
        }
        System.out.println();
        System.out.println();
        Collections.swap(obj,0,2);
        for(Object data :obj)
        {
            System.out.println(data);
        }
    }
}
