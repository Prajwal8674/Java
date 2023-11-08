package icreaseSize;

import java.util.ArrayList;

public class IcreaseSize {
    public static void main(String[] args) {
        ArrayList obj = new ArrayList<>();
        obj.add("Red");
        obj.add("Green");
        obj.add("Black");

        System.out.println(" Sample Output : " + obj);
        System.out.println("Size : "+obj.size());
        obj.add("White");
        obj.add("Pink");
        obj.add("Yellow");
        System.out.println(" Sample Output : " + obj);
        System.out.println("Size : "+obj.size());
    }
}
