package ExtractPortion;

import java.util.ArrayList;
import java.util.Collections;

public class Extract {
    public static void main(String[] args)
    {
        ArrayList obj= new ArrayList<>();
        obj.add("Red");
        obj.add("Green");
        obj.add("Orange");
        obj.add("White");
        obj.add("Black");
        System.out.println("Original Array : "+obj);
        System.out.println( "List of extract portion : "+obj.subList(0,3));

    }
}
