import java.util.*;    
class TestArrayLinked{    
 public static void main(String args[]){    
     
  List<String> al=new ArrayList<String>();//creating arraylist    
  al.add("Manish");//adding object in arraylist    
  al.add("saru");    
  al.add("vijecdra");    
  al.add("Krishna");    
    
  List<String> al2=new LinkedList<String>();//creating linkedlist    
  al2.add("Manish");//adding object in linkedlist    
  al2.add("vijendra");    
  al2.add("Bhilwara"); 
  al2.add("123123");    
  al2.add("vijay");    
    
  System.out.println("arraylist: "+al);  
  System.out.println("linkedlist: "+al2);  
 }    
}    