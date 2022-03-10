package Dhanraj03March;

public class MyDaemon extends Thread{
	public void run() {
		System.out.println("User or Daemon Thread");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDaemon t=new MyDaemon();
		MyDaemon t1=new MyDaemon();
		t.start();
		t1.setDaemon(true);
		t1.start();
		System.out.println("Main Thread");
		System.out.println(t1.getName()+" "+ t1.isDaemon());
	}

}
