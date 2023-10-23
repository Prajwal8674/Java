package day1;
import java.util.Scanner;
public class Area_And_Peremeter_Of_Square {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Sides Of The Square : ");
        int side=sc.nextInt();
        System.out.println("Area Of  Square Is : "+side*side);
        System.out.println("Perememetr Of Square Is :"+4*side);

    }
}
