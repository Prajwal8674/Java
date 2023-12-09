//Java program to find largest number among the three numbers
import java.util.*;
public class Largest{
 public static void main(String[] args){
          int n1,n2,n3;
          Scanner sc=new Scanner(System.in);
          n1=sc.nextInt();
          n2=sc.nextInt();
          n3=sc.nextInt();
     if(n1 >=n2) {
      if(n1 >=n3)
        System.out.println(n1 + "is the largest number.");
        else
         System.out.println(n3 + "is the largrst number.");
       } else {
         if(n2>=n3)
           System.out.println(n2 + "is the largest number.");
          else
           System.out.println(n3 + "is the largest number.");
         } 
}
}