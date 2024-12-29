package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.example.demo.entity.Book;

@Component
public class BookService {

	private static List<Book> list = new ArrayList<>();
	
	static {
		list.add(new Book(12, "Python Book","XYZ"));
		list.add(new Book(36, "C++ Book","PQR"));
		list.add(new Book(45, "Html", "KLM"));
	}
	//get all books
	public List<Book> getAllBooks()
	{
		return list;
	}
	
	//get single book by id
	public Book getBookById(int id)
	{
		Book book=null;
		book =list.stream().filter(e->e.getId()==id).findFirst().get();
	     return book;
	}
	
	//adding the book
	public Book addBook(Book b) {
		list.add(b);
		return b;
	}
	//delete book
	public void deleteBook(int bid)
	{
		list.stream().filter(book->book.getId()!=bid).
		collect(Collectors.toList());
		
	}
}
