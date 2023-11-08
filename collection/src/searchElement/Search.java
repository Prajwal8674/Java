package searchElement;

import java.util.ArrayList;
import java.util.Scanner;

public class Search {
    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);
        ArrayList obj = new ArrayList<>();
        obj.add("Red");
        obj.add("Green");
        obj.add("Orange");
        obj.add("White");
        obj.add("Black");
        System.out.println(obj);
        System.out.println("Enter Element You Want To Found : ");
        String S=sc.nextLine();
        obj.contains(S);
    if(obj.contains(S))
    {
        System.out.println("Found The Element !!");
    }


    }
}