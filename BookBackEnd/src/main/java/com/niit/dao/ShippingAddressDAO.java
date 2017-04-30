package com.niit.dao;

import java.util.List;

import com.niit.model.ShippingAddress;

public interface ShippingAddressDAO {
	
	ShippingAddress insertShippingAddress(ShippingAddress shippingAddress);
	void deleteShippingAddress(int id);
	ShippingAddress updateShippingAddress(ShippingAddress shippingAddress);	
	ShippingAddress getShippingAddressById(int id);
	List<ShippingAddress> getAllShippingAddresses();

}
