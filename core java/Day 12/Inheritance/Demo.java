class Room{
int length=10;
int breadth=20;

int area(){
return(length * breadth);
}

}
class Bedroom extends Room{
int height=30;
int volume(){
return (length * breadth * height);
}
}

class Demo{
public static void main(String args[]){

Bedroom bo=new Bedroom();
int area1 = bo.area();
int volume1 =bo.volume();

System.out.println("Area= "+ area1);
System.out.println("volume= "+ volume1);

}

}