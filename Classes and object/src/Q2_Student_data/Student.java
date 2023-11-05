package Q2_Student_data;

import java.util.Scanner;

public class Student {
    Scanner sc=new Scanner(System.in);
   Student()
   {
        String name;
       int roll_no;
       System.out.println("Enter The Name: ");
       name=sc.nextLine();
       System.out.println("Enter your roll number : ");
       roll_no=sc.nextInt();
       System.out.println(name);
       System.out.println(roll_no);
   }
}
