package com.crudop.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Books {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Book_ID")
	private int id;
	@Column(name="Book_Name")
	private String bookName;
	@Column(name="Author_Name")
	private String author;
	public Books(int id, String bookName, String author) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.author = author;
	}
	public Books() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Books [id=" + id + ", bookName=" + bookName + ", author=" + author + "]";
	}

	
	
}
