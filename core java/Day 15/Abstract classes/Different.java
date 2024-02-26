abstract class Myclass{
	abstract void calculate(double x);
}
class Sub1 extends Myclass{
	void calculate(double x){
		System.out.println("square= "+(x*x));
	}
}
class Sub2 extends Myclass{
void calculate(double x){
		System.out.println("square Root= "+Math.sqrt(x));
	}
}
class Sub3 extends Myclass{
void calculate(double x){
		System.out.println("Cube= "+(x*x*x));
	}
}

class Different{
	public static void main(String args[]){
		Sub1 obj1 = new Sub1();
		obj1.calculate(3);
Sub2 obj2 = new Sub2();
obj2.calculate(3);
Sub3 obj3 = new Sub3();
obj3.calculate(3);
		
	}
}
