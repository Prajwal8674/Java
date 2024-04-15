// Create a superclass.
class A {
private int i=10; // public by default
 }
// A's j is not accessible here.
class B extends A {
int total;
void sum() {
total = i + 3; // ERROR, j is not accessible here
}
}
class Access {
public static void main(String args[]) {
B subOb = new B();
subOb.sum();
System.out.println("Total is " + subOb.total);
}
}