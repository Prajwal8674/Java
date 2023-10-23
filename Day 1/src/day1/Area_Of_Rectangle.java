package day1;
import java.util.Scanner;

public class Area_Of_Rectangle {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Length Of Rectangle : ");
        double a=sc.nextDouble();
        System.out.print("Enter The Breadth Of Rectangle : ");
        double b=sc.nextDouble();
        double area=a*b;
        int area1=(int)area;
        System.out.println("Area Of Rectangle Is : "+area1);
    }
}
