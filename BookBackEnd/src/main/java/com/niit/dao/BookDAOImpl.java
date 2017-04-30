package com.niit.dao;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.model.Books;	

	@Repository
	public class BookDAOImpl implements BookDAO{

		@Autowired
		SessionFactory sessionFactory;
		
		
		public Books insertBook(Books book) {
			Session session=sessionFactory.openSession();
			session.save(book);
			session.flush();
			session.close();
			return null;
		}

		public Books updateBook(Books book) {
			// TODO Auto-generated method stub
			return null;
		}

		public void deleteBook(int id) {
			// TODO Auto-generated method stub
			
		}

		public Books getBookById(int id) {
			// TODO Auto-generated method stub
			return null;
		}

		public List<Books> getAllBooks() {
			Session session=sessionFactory.openSession();
			Query query=session.createQuery("from Books");
			List<Books> books=query.list();
			return books;
		}

	}



