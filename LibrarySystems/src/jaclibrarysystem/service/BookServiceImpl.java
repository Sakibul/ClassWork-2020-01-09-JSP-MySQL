package jaclibrarysystem.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jaclibrarysystem.dataaccessobject.BookDao;
import jaclibrarysystem.model.Book;

//import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService{

	@Autowired
	BookDao bookDao;
	
	List<Book> listBooks;
	
	public BookServiceImpl() {
		listBooks = new ArrayList<Book>();
		
		listBooks.add(new Book(101, "Title101", "Computer", "Author101", 9999));
		listBooks.add(new Book(102, "Title102", "Computer", "Author102", 9998));
		listBooks.add(new Book(103, "Title103", "Computer", "Author103", 9997));
		listBooks.add(new Book(104, "Title104", "Computer", "Author104", 9996));
		listBooks.add(new Book(105, "Title105", "Computer", "Author105", 9995));
		listBooks.add(new Book(106, "Title106", "Computer", "Author106", 9994));
	}
	
	public List<Book> getComputerBooks(){
		List<Book> arrBooks = new ArrayList<Book>();
		
		arrBooks.add(new Book( 1, "Title1", "Computer", "Author1", 123));
		arrBooks.add(new Book( 2, "Title2", "Computer", "Author2", 456));
		arrBooks.add(new Book( 3, "Title3", "Computer", "Author3", 789));
		arrBooks.add(new Book( 4, "Title4", "Computer", "Author1", 012));
		arrBooks.add(new Book( 5, "Title5", "Computer", "Author2", 345));
		arrBooks.add(new Book( 6, "Title6", "Computer", "Author1", 678));
		
		return arrBooks;
	}
	
	public List<Book> getNovels(){
		List<Book> arrBooks = new ArrayList<Book>();
		
		arrBooks.add(new Book( 7, "Title501", "Novel", "Author357", 901));
		arrBooks.add(new Book( 8, "Title502", "Novel", "Author159", 234));
		arrBooks.add(new Book( 9, "Title503", "Novel", "Author258", 567));
		arrBooks.add(new Book(10, "Title504", "Novel", "Author852", 890));
		arrBooks.add(new Book(11, "Title505", "Novel", "Author753", 101));
		arrBooks.add(new Book(12, "Title506", "Novel", "Author951", 202));
		
		return arrBooks;
	}

	@Override
	public boolean addBook(Book bookObj) {
		return bookDao.insertBook(bookObj) > 0 ;
	}

	@Override
	public List<Book> getBooks() {
		return bookDao.getBooks();
	}

	@Override
	public Book getBookById(int BookId) {
		return bookDao.getBookById(BookId);
	}

	@Override
	public boolean updateBook(Book bookObj) {
		return bookDao.updateBook(bookObj);
	}

	@Override
	public boolean deleteBook(int BookId) {
		return bookDao.deleteBook(BookId);
	}
}