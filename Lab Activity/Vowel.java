package LabActivity;
import java.util.*;
public class Vowel {
    public static void main(String[] args)
        
    {
    	System.out.println("Enter the String");
    	Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase();
        int count = 0;
 
        for (int i = 0; i < str.length(); i++) {
           
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e'
                || str.charAt(i) == 'i'
                || str.charAt(i) == 'o'
                || str.charAt(i) == 'u') {
            	
            	  count++;
            }
        }
 
      
        System.out.println(
            "Total no of vowels in string are: " + count);
    }
}