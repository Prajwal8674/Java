final class A{
 

 void callme(){   

System.out.println("I m fine");
}
}

class B extends A{
void callme(){
System.out.println("How r u?");

}
}

class Inheritance{
public static void main(String args[]){
A a = new A();
B b = new B();

a.callme();
b.callme();

}

}
