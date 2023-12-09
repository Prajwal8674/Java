import java.util.*;
public class Numbers{
 public static void main(String args[]){
 int arr[]=new int[20];
 int n,i;
 System.out.println("Enter the length of an array :");
 Scanner sc= new Scanner(System.in);
 n=sc.nextInt();
 System.out.println("Enter the elements of thr array:");
 for (i=0;i<n;i++)
{
//reading array elements from thr user
arr[i]=sc.nextInt();
int largest =arr[0];

 {
  if (arr[i] >largest)
    {
   largest=arr[i];
    }
    }
       System.out.println("Largest no = "+largest);
}
}



