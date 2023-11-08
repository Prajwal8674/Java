package ReplaceElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Replace {
    public static void main(String[] args) {
        ArrayList obj = new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        obj.add("Red");
        obj.add("Green");
        System.out.println(obj);
        System.out.print("Replace second element with : ");
        String S=sc.nextLine();
      obj.set(1,S);
        System.out.println(obj);
    }
}
