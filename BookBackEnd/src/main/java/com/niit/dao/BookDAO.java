package com.niit.dao;
import java.util.List;

import com.niit.model.Books;	
	
	public interface BookDAO {

		public Books insertBook(Books book);

		public Books updateBook(Books book);

		void deleteBook(int id);

		Books getBookById(int id);

		List<Books> getAllBooks();

	}



