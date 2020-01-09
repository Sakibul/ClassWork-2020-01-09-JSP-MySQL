package jaclibrarysystem.service;

import java.util.List;

import jaclibrarysystem.model.Book;

public interface BookService {
	public List<Book> getComputerBooks();
	public List<Book> getNovels();
	
	public boolean addBook(Book bookObj); // CREATE
	
	public List<Book> getBooks(); // READ
	
	public Book getBookById(int BookId); // READ
	
	public boolean updateBook(Book bookObj); // UPDATE
	
	public boolean deleteBook(int BookId); //DELETE
}