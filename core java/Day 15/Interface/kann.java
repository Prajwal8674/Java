interface Shape {

	public double area();
	public double volume();
}
public class kann implements Shape {

	 int x, y;
	public kann() {
		x = 10;
		y = 20;
	}
	public double area() {
		return x*y;
	}
	public double volume() {
		return x+y;
	}
	public void print() {
		System.out.println("point: " + x + "," + y);
	}
	public static void main(String args[]) {
		kann p = new kann();
		double v1,a1;
		v1=p.area();
		a1=p.volume();
		p.print();
		System.out.println("volume is:"+v1);
		System.out.println("Area is:"+a1);
		
		
	}
}