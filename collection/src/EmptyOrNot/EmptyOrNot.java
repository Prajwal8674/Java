package EmptyOrNot;

import java.util.ArrayList;

public class EmptyOrNot {
    public static void main( String[] args)
    {
        ArrayList obj = new ArrayList<>();
        obj.add("Red");
        obj.add("Green");
        obj.add("Black");
        obj.add("White");
        obj.add("Pink");
        System.out.println(" Sample Output : " + obj);
        System.out.println("cheking all array is is empty or not  : "+ obj.isEmpty());
        obj.removeAll(obj);

        System.out.println("cheking all array is is empty or not  : "+ obj.isEmpty());

    }
}
