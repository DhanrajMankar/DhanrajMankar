package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.Entity.Author;
import com.Entity.Book;

public class HibernateStandAlone implements bookDao{
    
	public void createBook() throws IOException
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		int price;
		String bookName;
		
		Scanner s = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String authorfeild,authorName,authorEmail;
		long contactNo;
		
		Author author=new Author();
		Book b1=new Book();
		
		System.out.println("Do you already registered as a Author ? y/n");
		char an=s.next().charAt(0);
		
		if(an=='y'||an=='Y') {
			  
			System.out.println("Enter regigterd  Doctor id");
		   int i= s.nextInt();
		
		   Author p=session.get(Author.class, i);
		   
		   
		   System.out.println("How many Books do you want to register?");
			 int n=s.nextInt();
			 for(int i1=0;i1<n;i1++)
			 {
			System.out.println("Enter book Name");
			bookName=br.readLine();		
			
			System.out.println("Enter Patient Mobile");
			price=s.nextInt();
			
			b1.setBookName(bookName);
			b1.setPrice(price);
		   
			b1.setAuthor(author);
			session.persist(b1);
			
		}
	}
		else
		{
			  
		System.out.println("Enter Author Name");
		authorName=br.readLine();	
		System.out.println("Enter Author feild");
		authorfeild=br.readLine();
		System.out.println("Enter Author Email");
	    authorEmail=br.readLine();
		System.out.println("Enter Author Mobile No");
		contactNo=s.nextLong();
		
		
		author.setAuthorName(authorName);
		author.setAuthorEmail(authorEmail);
		author.setAuthorfeild(authorfeild);
		author.setContactNo(contactNo);
		
		 System.out.println("How many Book details do you want to register?");
		 int n=s.nextInt();
		 for(int i=0;i<n;i++)
		 {
			 System.out.println("Enter book Name");
			 bookName=br.readLine();		
			 System.out.println("Enter Book Price");
				price=s.nextInt();
			
				b1.setBookName(bookName);
				b1.setPrice(price);
			   
				b1.setAuthor(author);
				session.persist(b1);
	
		 }
	}
		
		
		t.commit();
		System.out.println("Book is/Are record inserted succesffully!");
		session.close();
	}
	
	public void readBook()
	{   
		Session session = HibernateUtil.getSessionFactory().openSession();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Patient id");
		int i= s.nextInt();
		
		Book b2=session.get(Book.class, i);
		
		System.out.println("Book Id is:"+b2.getBook_Id()+"Book Name is :"+b2.getBookName()+"Book price is :"+b2.getPrice());
		
		System.out.println(" enter doctor id: ");
			int x= s.nextInt();
			Author d=session.get(Author.class, x);
			System.out.println("Author Id"+d.getAuthor_id()+"Author Name"+d.getAuthorName()+"Author Email"+d.getAuthorEmail()+"Author Feild"+d.getAuthorfeild()
			);
			session.close();
	        
	}
	
	
	public void updateBook() throws IOException  
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		Scanner s = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter bookk_id to update");
		int i = s.nextInt();
		Book p = session.get(Book.class,i);
		System.out.println("Update:\n 1. Book Name\n 2. Book Price \n 3. Exit");
		int ch=s.nextInt();
			switch(ch)
			{
				case 1:System.out.println("Enter Book name to update ");
						String BookName=br.readLine();
						p.setBookName(BookName);
						session.update(p);
						System.out.println("Book Name updated successfully!");
						t.commit();
						break;
				
				case 2:System.out.println("Enter new price to update");
						int price=s.nextInt();
						p.setPrice(price);
						session.update(p);
						System.out.println("Book price is updated successfully!");
						t.commit();
						break;
			    
				case 3:System.out.println("exit");
				      break;		
				
				default:
						System.out.println("Invalid Input");			
			}	
	}
	
	public void deleteBook()
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Book id to delete");
		int i = s.nextInt();
		Book p = session.get(Book.class,i);
		session.delete(p);
		System.out.println(" Book record deleted successfully!");
		t.commit();
	}
	
	public static void main(String[] args) throws IOException {
		
		HibernateStandAlone obj=new HibernateStandAlone();
	
		
		char ans1;
    	do {
		System.out.println("Enter your Choice:\n\n1:Enter the new book \n2.Get the book Information\n3.Upadate the Book\n4.Delete the Book\n5:exit");
		
		
		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();
		
		
		switch(ch)
		{  
		 case 1:
		    obj.createBook();
		    break;
		 case 2: 
			obj.readBook();
			break;
		 case 3:
			 obj.updateBook();
			 break;
		 case 4:
				obj.deleteBook();
				break;
		 case 5:
			 System.out.println("Exit");
			 break;
			 
		default: 
			System.out.println("Invalid choice");
		}
		
		System.out.println("Do you want to process again  y/n ?");
		 ans1=sc.next().charAt(0);
		
	}while(ans1=='Y'||ans1=='y');
		
	System.out.println("Thank you for using our system !");
	}

}