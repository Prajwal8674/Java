import java.io.*;
class MyThread extends Thread{
	boolean stop = false;
	public void run(){
		
		for(int i=0;i<=10000;i++){
			System.out.println(i);
			if(stop) return;
				
		}
	}
}
class Demo2{
	public static void main(String args[])throws IOException{
		MyThread obj = new MyThread();
		Thread t = new Thread(obj);
		t.start();
		System.in.read();
		obj.stop = true;
	}
}