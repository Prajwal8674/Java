package employee_project;
import java.util.Scanner;
public class MainC {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        GetData[] a;
        int data;
        System.out.println("Enter How Many Employees Data You Want To Store :  ");
        data = sc.nextInt();
        a= new GetData[data];
        for (int i = 0; i < a.length; i++) {
            a[i] = new GetData();
            a[i].getdata();
            a[i].showdata();
            System.out.println();
        }
    }
}
