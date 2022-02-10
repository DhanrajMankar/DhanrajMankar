package Dhanarjanudip01;

import java.util.HashSet;

 class Book1 extends Book {
	      public static void main(String[] args) 
			{  
/* private int id;
 private int quantity;
 private String name;
 private String author;
 private String publisher;
*/
	    	  Book b1=new Book();
	    	  b1.setId(402);
	    	  b1.setAuthor("Dhanraj");
	    	  b1.setName("java mechanics");
	    	  b1.setQuantity(1000);
	    	  b1.setPublisher("Govermment polytechnic Amravati");
	    	  
	    	  Book b2=new Book();
	    	  b2.setId(402);
	    	  b2.setAuthor("Dhanraj1");
	    	  b2.setName("mechanics");
	    	  b2.setQuantity(1001);
	    	  b2.setPublisher("Govermment polytechnic Amravati");
	    	  
	    	  Book b3=new Book();
	    	  b3.setId(402);
	    	  b3.setAuthor("Dhanraj2");
	    	  b3.setName("fluid mechanics");
	    	  b3.setQuantity(1002);
	    	  b3.setPublisher("Govermment polytechnic Amravati");
	    	  
				HashSet<Book> set=new HashSet<Book>();  
			    set.add(b1);  
			    set.add(b2);  
			    set.add(b3);  
			    
			   int n=b1.getId();
			   System.out.println(n);
			   
			    //Traversing HashSet  
			    for(Book b:set)
			    {  
			   // System.out.println(set);
			   // System.out.println(set(b1.getId());
			    }  
			}  

}
