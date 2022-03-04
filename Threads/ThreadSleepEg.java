package Dhanraj03March;

public class ThreadSleepEg extends Thread {
	
	public void run() {
		for(int i=0;i<=10;i++)
		{
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		
		ThreadSleepEg t=new ThreadSleepEg();
		t.start();
		ThreadSleepEg t1=new ThreadSleepEg();
		t1.start();
		ThreadSleepEg t2=new ThreadSleepEg();
		t2.start();
		
	}

}
