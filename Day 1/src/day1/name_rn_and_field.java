package day1;
import java.util.Scanner;

public class name_rn_and_field {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Name : ");
        String name =sc.nextLine();
        System.out.println("Enter Your Roll Number :  ");
        int rn=sc.nextInt();
        System.out.println("Enter Your Field Of Interest : ");
        float field=sc.nextFloat();

        System.out.println("Hey ! My Name Is "+name+" And My roll Number Is "+rn+" My Field Of Interests Are "+field );

    }
}
