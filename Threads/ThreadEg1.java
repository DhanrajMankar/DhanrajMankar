package Dhanraj03March;

public class ThreadEg1 extends Thread {
	public void run() {
		System.out.println("Thread is runing....");
	}
	
	public static void main(String[] args) {
		
		ThreadEg1 t =new ThreadEg1();
        Thread m=new Thread(t);
        m.start();
	}

}
