package com.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name="BookDetails")
@Entity
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int book_Id;
	@Column(name="bookName",nullable=false)
	private String bookName;
	
	@Column(name="book_Price", unique=true,nullable=false)
	private int price;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="Authorid")
	private Author author;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Book(String bookName, int price, Author author) {
		super();
		this.bookName = bookName;
		this.price = price;
		this.author = author;
	}

	public int getBook_Id() {
		return book_Id;
	}
	public void setBook_Id(int book_Id) {
		this.book_Id = book_Id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	
}