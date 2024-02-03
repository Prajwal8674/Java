package employee_project;
import java.util.Scanner;

public class GetData {
    public int id;
    public String name ;
    public String jd;
    public double salary;

        void getdata()
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter The Name Of the Employee : ");
            name= sc.nextLine();
            System.out.println("Enter The joining Date Of The Employee :");
            jd=sc.nextLine();
            System.out.println("Enter The ID Of An Employee : ");
            id=Integer.parseInt(sc.nextLine());
            System.out.println("Enter The Salary Of An Employee : ");
            salary=Double.parseDouble(sc.nextLine());
        }
        void showdata()
        {
            System.out.println();
            System.out.println(" The ID Of An Employee : " +id);
            System.out.println("The Name Of An Employee : "+name);
            System.out.println("The Joining Date Of An Employee : "+jd);
            System.out.println("The Salary Of The Employee : "+salary);
        }
}
