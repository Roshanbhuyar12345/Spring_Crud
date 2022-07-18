package com.crudop.service;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudop.Entity.Books;
import com.crudop.repository.BookReposiroty;

@Service
public class BookService {
	@Autowired
	private BookReposiroty bookReposiroty;

	private List<Books> list = new ArrayList<Books>();
	
	//getting all books 
	public List<Books> getAllBooks(){
		List<Books> book=new ArrayList<Books>();
		this.bookReposiroty.findAll().forEach(b->book.add(b));
		return book;
		
	}

	// geting books from database
	public Books getById(int id) {

		return bookReposiroty.findById(id).get();

	}

	// adding books
	public void save(Books books) {
		this.bookReposiroty.save(books);
	}

	//updating books by id
	public void update(Books book,int id) {
		
		this.bookReposiroty.save(book);
		}
	
	public void delete(int id) {
		
		this.bookReposiroty.deleteById(id);
		
	}
	
	
	
}
