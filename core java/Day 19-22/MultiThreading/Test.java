class Test extends Thread
{  
	public void run()
	{  
		try{ 
			for(int i=1;i<=100;i++)
			{ 
				System.out.println("LAZY") ;   
				Thread.sleep(100);  
			}
		}catch(Exception e){System.out.println(e);}  
			//System.out.println(i);  
	}  
 
public static void main(String args[]){  
 Test t1=new Test();  
 //TestJoinMethod2 t2=new TestJoinMethod2();  
 //TestJoinMethod2 t3=new TestJoinMethod2();  
 t1.start();  
 //t1.interrupt();
System.out.println("main");
 
 }  
}  