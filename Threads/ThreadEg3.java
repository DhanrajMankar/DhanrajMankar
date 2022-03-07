package Dhanraj03March;
import java .lang.Thread;
public class ThreadEg3 extends Thread
{
	public void run() {
		System.out.println("Thread----its my thread");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ThreadEg3 t=new ThreadEg3();
      t.start();
      
	}

}
