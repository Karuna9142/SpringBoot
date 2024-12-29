package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Book;
import com.example.demo.services.BookService;

import ch.qos.logback.core.joran.spi.HttpUtil.RequestMethod;

@RestController
public class BookController {
	
	@Autowired
	private BookService bookServices;
	
	
	//get all books handler
	@GetMapping("/books")
	//@ResponseBody
	public List<Book> getBooks() {

//		Book book = new Book();
//		book.setId(678);
//		book.setTitle("Java Edition");
//		book.setAuthor("James Gosling");
		
		//return book;
		return this.bookServices.getAllBooks();
	}
	
	//get single book handler
	@GetMapping("/books/{id}")
	public Book getBook(@PathVariable("id") int id)
	{
		return bookServices.getBookById(id);
	}
	// new book handler
	@PostMapping("/books")
	public Book addBook(@RequestBody Book book)
	{
		Book b = this.bookServices.addBook(book);
		return b;
	}
	
	//delete book controller
	@DeleteMapping("/books/{bookId}")
	public void deleteBook(@PathVariable("bookId")int bookId) {
		
		this.bookServices.deleteBook(bookId);
	}

}
