package jaclibrarysystem.dataaccessobject;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import jaclibrarysystem.model.Book;

public class BookMapper implements RowMapper<Book> {

	@Override
	public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new Book(rs.getInt("id"), rs.getString("title"),
				rs.getString("genre"), rs.getString("author"), rs.getInt("isbn"));
	}
}