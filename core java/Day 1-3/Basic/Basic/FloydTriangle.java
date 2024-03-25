import java.util.Scanner;
 
class FloydTriangle
{
   public static void main(String args[])
   {
      int n, num = 1;
      Scanner in = new Scanner(System.in);
 
      System.out.println("Enter the number of rows of floyd's triangle you want");
      n = in.nextInt();
 
      System.out.println("Floyd's triangle :-");
 
      for (int c = 1 ; c <= n ; c++ )
      {
         for (int d = 1 ; d <= c ; d++ )
         {
            System.out.print(num+" ");
            num++;
         }
 
         System.out.println();
      }
   }
}