//java program to find largest form an array 
import java.util.*;
	class LargestOfArray {
	public static void main (string[] args){

	int number [] = new int [10];
	int i, largest = 0 ;
	Scanner Sc =new Scanner (System.in);

	system.out.println ("Enter any 10 numbers :");
	for (i = 0 , i< 10; i++) {
	number[i] = SC. next Int();
}
	largest = numbers [0];
	for(i=0; i<10;i++){
	if(number= [i]>largest){
	largest=number[i];
}
}
System.out.println ("Largest Number in an array is : "+ largest);
}
}