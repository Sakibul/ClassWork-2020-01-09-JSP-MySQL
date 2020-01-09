package jaclibrarysystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import jaclibrarysystem.model.Book;
import jaclibrarysystem.service.BookService;

@Controller
public class BookController {
	
	@Autowired
	BookService service;
	
	@RequestMapping(value = "/getNovels", method = RequestMethod.GET)
	public ModelAndView getNovelsList() {
		ModelAndView modelView = new ModelAndView("book-list");

		List<Book> arrBooks = service.getComputerBooks();
		modelView.addObject("bookList", arrBooks);
		
		return modelView;
	}

	@RequestMapping(value = "/getComputerBooks", method = RequestMethod.GET)
	public ModelAndView getComputerBooksList() {
		ModelAndView modelView = new ModelAndView("book-list");

		List<Book> arrBooks = service.getNovels();
		modelView.addObject("bookList", arrBooks);
		
		return modelView;
	}
}