// java program for first 10 prime numbers
public class PrimeNumbers{
	public static void main(String args[]){
	int i, number=2, count=1, flag;
	System.out.println("first 10 prime numbers are : ");
	while(count<=10)
	{
                    flag=1;
	      for(i=2;i<=number/2;i++)
	      {
	          if(number%i==0){
		flag=0;
	      }
	}
	     if (flag==1) {
                     System.out.print(number +" ");
		count++;
	}
		number++;
        }
        }
}
		