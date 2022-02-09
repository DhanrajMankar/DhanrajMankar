package Dhanarjanudip01;
import java.util.*;
public class link_list_practical2 {

	public static void main(String[] args)//it  immplement the colection interface
	{
		LinkedList<String> al=new LinkedList<String>();  
		al.add("Ravi");  
		al.add("Vijay");  
		al.add("Ravi");  
		al.add("Ajay");  
		Iterator<String> itr=al.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		}  
		
	}