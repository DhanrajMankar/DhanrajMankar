
package Dhanraj03March;
import java.util.InputMismatchException;
public class ExceptionAssin {

	public static void main(String[] args) {
	
		int n1=6;
		int n2=3;
		try {
			try {
			int result=n1/n2;
			System.out.println("Result="+result);
		}
			catch(InputMismatchException i)
			{
				System.out.println(i);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
    
	}

}
