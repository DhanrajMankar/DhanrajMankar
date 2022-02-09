package Dhanarjanudip01;
import java.util.*;
public class Queue1 {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
	      q.add(6);
	      q.add(1);
	      q.add(8);
	      q.add(4);
	      q.add(7);
	      System.out.println("The queue is: " + q);
	      int num1 = q.remove();
	System.out.println("The element deleted from the head is: " + num1);
	System.out.println("The queue after deletion is: " + q);
	int head = q.peek();
	System.out.println("The head of the queue is: " + head);
	}

}
