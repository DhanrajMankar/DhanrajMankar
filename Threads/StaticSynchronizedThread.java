package Dhanraj03March;

public class StaticSynchronizedThread {
	
	public static void main(String[]args) {
	    
	      
	      Thread t=new Thread() {
	    	  public void run() {
	    		  print.display(5);}};
	    		  
	    		  Thread t1=new Thread() {
	    	    	  public void run() {
	    	    		  print.display(10);}};
	    	    		  
	    	    		  Thread t2=new Thread() {
	    	    	    	  public void run() {
	    	    	    		  print.display(15);}};
	    	    	    		  
	    	   t.start();
	    	   t1.start();
	    	   t2.start();
		}

	}

synchronized class print{
	   static void display(int num) {
			for(int i=1;i<=10;i++)
			{
				System.out.println(num*i);
				try {Thread.sleep(500);}
				catch(Exception e) {
					System.out.println(e);}	
			}
		}
	}
	class MyThread extends Thread{
		print p;
		MyThread(print p){
			print.display(10);
		}
	}
	class MyThread1 extends Thread{
		print p;
		MyThread1(print p){
			print.display(20);
		}
	}


