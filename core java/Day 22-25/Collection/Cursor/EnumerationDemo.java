import java.util.*;
class EnumerationDemo{ 
	public static void main(String args[]){
	Vector v = new Vector();
	for(int i=0;i<10;i++){
		v.addElement(1);
	}
	System.out.print(v);
	Enumeration e=v.element();
	whlile(e.hasMoreElement){
		Integer I = (Integer)e.nextElement();
		if(I%==2){
		System.out.println(I);}
	}
	System.out.println(v);
	}
}