package ShuffleArray;

import java.util.ArrayList;
import java.util.Collections;

public class Shuffle {
    public static void main(String[] args) {
        ArrayList obj = new ArrayList<>();

        obj.add("Red");
        obj.add("Green");
        obj.add("Orange");
        obj.add("White");
        obj.add("Black");

        System.out.println("List before shuffling : "+obj);
        Collections.shuffle(obj);
        System.out.println("List after shuffling : "+obj);

    }
    }
