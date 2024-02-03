package StudentManagement;

import java.util.Scanner;

public class main {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        final int n;
        int i;
        Menu M=new Menu();
        AddShow[] A;
        M.menu();
            if(M.ch==1)
            {
                System.out.println("You Have Entered 1 : ADD DATA");
                System.out.println("Enter Number of Student");
                n=sc.nextInt();

                for(i=0;i<n;i++)
                {
                    A[i].add();
                }
            }
                M.menu();
        if(M.ch==2)
        {
            System.out.println("You Have Entered 2 : SHOW DATA");
            System.out.println("Record Showed Below");
            for (i=0;i<2;i++)
            {
                A[i].show();
            }
        }

        }
    }

