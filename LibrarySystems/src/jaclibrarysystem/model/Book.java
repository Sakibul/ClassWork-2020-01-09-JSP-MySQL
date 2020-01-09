package jaclibrarysystem.model;

public class Book {
	private int id;
	private String title;
	private String genre;
	private String author;
	private int isbn;
	
	public Book(){}
	
	public Book(int _id_, String _title_, String _genre_, String _author_, int _isbn_){
		this.id = _id_;
		this.title = _title_;
		this.genre = _genre_;
		this.author = _author_;
		this.isbn = _isbn_;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String bookName) {
		this.title = bookName;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}