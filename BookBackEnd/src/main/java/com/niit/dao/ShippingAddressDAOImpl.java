package com.niit.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.model.ShippingAddress;

@Repository
public class ShippingAddressDAOImpl implements ShippingAddressDAO{
	
	@Autowired
	SessionFactory sessionFactory;

	public ShippingAddress insertShippingAddress(ShippingAddress shippingAddress) {
		Session session=sessionFactory.openSession();
		session.save(shippingAddress);
		session.flush();
		session.close();
		return null;
	}

	public void deleteShippingAddress(int id) {
		// TODO Auto-generated method stub
		
	}

	public ShippingAddress updateShippingAddress(ShippingAddress shippingAddress) {
		// TODO Auto-generated method stub
		return null;
	}

	public ShippingAddress getShippingAddressById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<ShippingAddress> getAllShippingAddresses() {
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from ShippingAddress");
		List<ShippingAddress> shippingAddresses=query.list();
		return shippingAddresses;
	}

}
