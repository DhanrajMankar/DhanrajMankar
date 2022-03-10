package Dhanraj03March;

public class WaitAndNotify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      OddEven SharedResource=new OddEven();
      Odd oddnum=new Odd(100,SharedResource);
      Even Evennum=new Even(100,SharedResource);
      
      oddnum.start();
      Evennum.start();
	}

}
class Even extends Thread{
	int maxevenno;
	OddEven SharedResource;
	Even(int no,OddEven  SharedResource ){
		this.maxevenno=no;
		this.SharedResource=SharedResource;
	}
	public void run() {
		int minevenno=1;
		try {
			while(minevenno<=maxevenno)
				SharedResource.printOddNo(minevenno);
			    minevenno=minevenno+2;
		}
		catch(Exception e)
		{System.out.println(e);}
	}
	
}
class Odd extends Thread{
	int maxoddno;
	OddEven SharedResource;
	Odd(int no,OddEven  SharedResource ){
		this.maxoddno=no;
		this.SharedResource=SharedResource;
	}
	public void run() {
		int minoddno=2;
		try {
			while(minoddno<=maxoddno)
				SharedResource.printOddNo(minoddno);
			    minoddno=minoddno+2;
		}
		catch(Exception e)
		{System.out.println(e);}
	}}
