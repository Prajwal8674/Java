class MyThread extends Thread{
	public void run(){
		for( int i=0;i<=10000;i++){
			System.out.println(i);
		}
	}
}
class Demo1{
	public static void main(String args[]){
		MyThread obj = new MyThread();
		Thread t = new Thread(obj);
		t.start();
	}
}