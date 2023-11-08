package TrimArray;

import java.util.ArrayList;

public class Trim {
    public static void main(String[] args) {
        ArrayList obj = new ArrayList<>();
        obj.add("Red");
        obj.add("Green");
        obj.add("Black");
        obj.add("White");
        obj.add("Pink");
        System.out.println(" Sample Output : " + obj);
        obj.trimToSize();
        System.out.println(" Let trim to size to above array  : " + obj);

    }
}