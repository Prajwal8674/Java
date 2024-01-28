class Bank{  
int getRateOfInterest(){return 0;}  
}  
  
class SBI extends Bank{  
int getRateOfInterest(){return 8;}  
}  
  
class ICICI extends Bank{  
int getRateOfInterest(){return 7;}  
}  
class AXIS extends Bank{  
int getRateOfInterest(){return 9;}  
}  
  
class Test3{  
public static void main(String args[]){  
   
Bank b1=new SBI();  
System.out.println("SBI Rate of Interest: "+b1.getRateOfInterest());  
Bank b2=new ICICI();  
System.out.println("SBI Rate of Interest: "+b2.getRateOfInterest());  
Bank b3=new AXIS();  
System.out.println("SBI Rate of Interest: "+b3.getRateOfInterest());  
Bank b4=new Bank(); 
System.out.println("Bank Rate of Interest: "+b4.getRateOfInterest());

  
}  
}