package constructor1;

import java.util.Scanner;

public class main {
    public static void main(String[] args )
    {
        String S;
        int R;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Your Name : ");
        S=sc.nextLine();
        System.out.println("Enter Your Roll Number :");
        R=sc.nextInt();
        Student a=new Student(S,R);
        a=new Student();
        System.out.println();


    }
}