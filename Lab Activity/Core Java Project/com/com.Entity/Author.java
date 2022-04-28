package com.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Table(name="AuthorDetails")
@Entity
public class Author {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int author_id;
	@Column(name="Feild",nullable=false)
	private String authorfeild;
	@Column(name="authorName",nullable=false)
	private String authorName;
	@Column(name="auhor_email", unique=true,nullable=false)
	private String authorEmail;
	public int getAuthor_id() {
		return author_id;
	}
	public void setAuthor_id(int author_id) {
		this.author_id = author_id;
	}
	public String getAuthorfeild() {
		return authorfeild;
	}
	public void setAuthorfeild(String authorfeild) {
		this.authorfeild = authorfeild;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getAuthorEmail() {
		return authorEmail;
	}
	public void setAuthorEmail(String authorEmail) {
		this.authorEmail = authorEmail;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	@Column(name="contactNo",nullable=false, unique=true)
	private long contactNo;
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Author(String authorfeild, String authorName, String authorEmail, long contactNo) {
		super();
		this.authorfeild = authorfeild;
		this.authorName = authorName;
		this.authorEmail = authorEmail;
		this.contactNo = contactNo;
	}
	
	
}