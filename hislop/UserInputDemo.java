import java.util.*;
//program to perform basic arithmetic operations
class UserInputDemo{
	public static void main(String args[]){
	int a,b,c,d;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter any four numbers:-");
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
	d=sc.nextInt();
	System.out.println("Addition = "+(a+b+c+d)); 	//Addition 
	System.out.println("Subtraction = "+(a-b));		//Subtraction
	System.out.println("Multiplaction = "+(b*c)); 	//Multiplication
	System.out.println("Division = " +(c/d));		//Division
}

}