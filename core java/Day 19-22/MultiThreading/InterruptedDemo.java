class MyThread extends Thread{
	public void run(){
		try{
		for(int i=0;i<20;i++){
			System.out.println("lazy");
			Thread.sleep(1000);
			}
		}catch(InterruptedException ie){
			System.out.println("I got Exception");
		}
	}
}
class InterruptedDemo{
	public static void main(String args[]){
		MyThread t = new MyThread();
		t.start();
		t.interrupt();
		System.out.println("End of main Thread");
	}
}