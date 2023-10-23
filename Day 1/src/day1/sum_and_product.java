package day1;
import java.util.Scanner;

public class sum_and_product
{
public static void main(String[] args)
{
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter First Number : ");
    int a=sc.nextInt();
    System.out.print("Enter The Second Number : ");
    int b=sc.nextInt();
    int sum=a+b;
    int product=a*b;
    System.out.println("The Sum Of  "+a+" And "+b+"  Is : "+sum);
    System.out.println("The Product Of  "+a+" And "+b+" Is : "+product);
}
}
