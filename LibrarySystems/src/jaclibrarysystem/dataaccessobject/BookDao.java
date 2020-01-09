package jaclibrarysystem.dataaccessobject;

import java.util.List;

import jaclibrarysystem.model.Book;

public interface BookDao {
	public int insertBook(Book bookObj); // CREATE
	
	public List<Book> getBooks(); // READ
	public Book getBookById(int BookId); // READ
	
	public boolean updateBook(Book bookObj); // UPDATE
	
	public boolean deleteBook(int BookId); // DELETE
}