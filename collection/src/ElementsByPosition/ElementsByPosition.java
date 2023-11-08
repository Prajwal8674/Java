package ElementsByPosition;

import java.util.ArrayList;
import java.util.Scanner;

public class ElementsByPosition {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList obj = new ArrayList<>();
        obj.add("Red");
        obj.add("Green");
        obj.add("Black");
        obj.add("White");
        obj.add("Pink");
        System.out.print("enter the index of the element :");
        for (Object data : obj) {
            int S=sc.nextInt();
        }
        for (Object data : obj) {
            System.out.println(data);
        }


    }
}
