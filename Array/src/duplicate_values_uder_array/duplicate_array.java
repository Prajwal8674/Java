package duplicate_values_uder_array;

import java.util.Scanner;

public class duplicate_array {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int[] n=new int[5];
        System.out.print("enter any 5 number : ");
        for(int i=0;i<n.length;i++)
        {
            n[i]=s.nextInt();
        }
        for(int i=0;i<n.length;i++)
        {
            for(int j=i+1;j<n.length;j++)
            {
                if(n[i]==n[j])
                {
                    System.out.print(n[j]+" is duplicate numbers");
                }

            }
            for(int j=i+1;j<=1;j++)
            {
                if(n[i]!=n[j])
                {
                    System.out.println("No duplicate numbers available in array elements !");
                }
            }


        }
    }
}
