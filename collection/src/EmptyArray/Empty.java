package EmptyArray;

import java.util.ArrayList;

public class Empty {
    public static void main(String[] args) {
        ArrayList obj = new ArrayList<>();
        obj.add("Red");
        obj.add("Green");
        obj.add("Black");
        obj.add("White");
        obj.add("Pink");
        System.out.println(" Sample Output : " + obj);
        obj.removeAll(obj);
        System.out.println(" Array List After remove all elements : " + obj);
    }
}