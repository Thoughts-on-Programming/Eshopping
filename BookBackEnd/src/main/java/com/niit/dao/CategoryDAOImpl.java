package com.niit.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.model.Category;

@Repository
public class CategoryDAOImpl implements CategoryDAO{
	
	@Autowired
	SessionFactory sessionFactory;
	
	public Category insertCategory(Category category) {
		
		Session session=sessionFactory.openSession();
		session.save(category);
		session.flush();
		session.close();
		return category;
	}

}
