package add_Integer_Between_0_to_1000;
import  java.util.Scanner;
public class add_number_between_0_to_1000 {
    public  static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input Integer Between 0 to 1000 : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int sum = a+b+c;
        System.out.println(" The Sum Of The All Digit in "+a+" "+b+" "+c+" is : "+(a+b+c));
    }
}
