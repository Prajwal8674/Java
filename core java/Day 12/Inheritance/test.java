class A
{
private int x = 6;
public int get()
{
return x;
}
}
class B extends A
{
	 int y = get();
	 int z=y+3;
	 void show(){
	 System.out.println(z); }
	 
}
class test
{
public static void main(String args [])
{
B b = new B();
System.out.println(b.get());
b.show();
}
}