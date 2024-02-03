package StudentManagement;

import java.util.Scanner;

public class AddShow {
    public int rn;
    public void add()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter The Roll Number :");
        rn=s.nextInt();
    }
    public void show()
    {
        System.out.println(rn);
    }
}
