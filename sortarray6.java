package Dhanarjanudip01;

import java.util.Arrays;
import java.util.Collections;

public class sortarray6 {

	public static void main(String[] args) {
	 String[] str= {"Mango","apple","grapes","papaya","pineapple","banana"," orage"};
	 Arrays.sort(str, Collections.reverseOrder());   
		System.out.println("Array elements in descending order: " +Arrays.toString(str));

	}

}
//O/p
//Array elements in descending order: [pineapple, papaya, grapes, banana, apple, Mango,  orage]
