package insert;

import java.util.ArrayList;
import java.util.Scanner;

public class Insert {
    public  static void main(String[] args)
    {
        ArrayList<String>al = new ArrayList<>();
        ArrayList<String>al2 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Colors: ");
       String a=sc.nextLine();
        String b=sc.nextLine();
        String c=sc.nextLine();
        String d=sc.nextLine();
        String e=sc.nextLine();

        al.add(0,a);
        al.add(1,b);
        al.add(2,c);
        al.add(3,d);
        al.add(4,e);
        System.out.println(al);
        System.out.println("Enter New Color : ");
        String x=sc.nextLine();
        al2.add(0,x);

        al.addAll(0,al2);
        System.out.println(al);
    }
}
