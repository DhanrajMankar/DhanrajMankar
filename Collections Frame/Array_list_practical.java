package Dhanarjanudip01;
import java.util.*;
public class Array_list_practical
{
	public static void main(String[] args) {
ArrayList<String> list=new ArrayList<String>();//Creating arraylist1
list.add("Ravi");//Adding object in arraylist1 
list.add("Vijay");  
list.add("Ravi");  
list.add("Ajay");  
//Traversing list through Iterator  
Iterator itr=list.iterator();  
while(itr.hasNext())
{  
System.out.println(itr.next());  
}
}
}