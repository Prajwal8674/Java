package Area_Reactangle;

import java.util.Scanner;

    public class Area {
        Scanner sc=new Scanner(System.in);
        double l,b,A;
        public void setDim()
        {
            System.out.println("Enter Length : ");
            l=sc.nextDouble();
            System.out.println("Enter The Breadth : ");
            b=sc.nextDouble();
        }
        public void getArea()
        {
            A=l*b;
            System.out.println(A);
        }
    }

