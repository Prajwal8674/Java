package SortArray;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Sort {
    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);
        ArrayList obj = new ArrayList<>();
        obj.add("Red");
        obj.add("Green");
        obj.add("Orange");
        obj.add("White");
        obj.add("Black");
        System.out.println("List before sort : "+obj);
        Collections.sort(obj);
        System.out.println("List After sort : "+obj);

    }
}