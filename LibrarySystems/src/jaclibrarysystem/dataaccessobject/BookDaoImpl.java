package jaclibrarysystem.dataaccessobject;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import jaclibrarysystem.model.Book;

@Repository
public class BookDaoImpl implements BookDao {
	JdbcTemplate jdbcTemplate;

	private final String SQL_INSERT_BOOK = "insert into " + "book(title, genre, author, isbn) values(?, ?, ?, ?)";

	private final String SQL_UPDATE_BOOK = "update " + "book(title, genre, author, isbn) set(?, ?, ?, ?)";

	private final String SQL_SELECT_BOOK = "select id, title, genre, author, isbn " + "from book";
		
	private final String SQL_SELECT_BOOK_BY_ID = "select id, title, genre, author, isbn from book where id = ?";
	
	private final String SQL_DELETE_BOOK = "delete book where id = ?";

	public BookDaoImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public int insertBook(Book bookObj) {
		return jdbcTemplate.update(SQL_INSERT_BOOK, bookObj.getTitle(), bookObj.getGenre(), bookObj.getAuthor(), bookObj.getIsbn());
	}

	@Override
	public List<Book> getBooks() {
		return jdbcTemplate.query(SQL_SELECT_BOOK, new BookMapper());
	}

	@Override
	public Book getBookById(int bookId) {
		return jdbcTemplate.queryForObject(SQL_SELECT_BOOK_BY_ID, 
				new Object[]{bookId}, new BookMapper());
	}

	@Override
	public boolean deleteBook(int bookId) {
		int deleteResult = jdbcTemplate.update(SQL_DELETE_BOOK, bookId);
		return deleteResult > 0;
	}

	@Override
	public boolean updateBook(Book bookObj) {
		int updateResult = jdbcTemplate.update(SQL_UPDATE_BOOK, bookObj.getTitle(), bookObj.getGenre(), bookObj.getAuthor(), bookObj.getIsbn());
		return updateResult > 0;
	}
}