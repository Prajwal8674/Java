class Myclass{

void claculate(double x){
System.out.println("Square="+(x*x));
}
}
class Comman{
public static void main(String agrs[]){
Myclass obj1 = new Myclass();
Myclass obj2 = new Myclass();
Myclass obj3 = new Myclass();

obj1.claculate(3);
obj2.claculate(4);
obj3.claculate(5);

}
}