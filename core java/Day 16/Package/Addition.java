package pack;
public class Addition{
	//instance variable
	private double d1,d2;
	
	public Addition(double a,double b){
		d1 = a;
		d2 = b;
	}
	public void sum(){
		System.out.println("Sum " +(d1+d2));
	}
}