package com.niit.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.model.BillingAddress;

@Repository
public class BillingAddressDAOImpl implements BillingAddressDAO{
	
	@Autowired
	SessionFactory sessionFactory;


	public BillingAddress insertBillingAddress(BillingAddress billingAddress) {
		Session session=sessionFactory.openSession();
		session.save(billingAddress);
		session.flush();
		session.close();
		return null;
	}

	public void deleteBillingAddress(int id) {
		// TODO Auto-generated method stub
		
	}

	public BillingAddress updateBillingAddress(BillingAddress billingAddress) {
		// TODO Auto-generated method stub
		return null;
	}

	public BillingAddress getBillingAddressById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<BillingAddress> getAllBillingAddresses() {
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from BillingAddress");
		List<BillingAddress> billingAddress=query.list();
		return billingAddress;
	}

}
