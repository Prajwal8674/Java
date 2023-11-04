package SumOfArray;

import java.util.Scanner;

public class Sum_Of_Array {
    public static void main(String[] args)
    {
        int a[] =new int[50];
        int i,sum=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Length Of An Array :");
        int l=sc.nextInt();
        System.out.println("Enter The Array Elements  : " );
        for( i=0 ; i<l ; i++)
        {
         a[i]=sc.nextInt();
        }
        for(i=0 ; i<l ; i++)
       {
            sum+=a[i];
        }
        System.out.println(sum);



    }
}
