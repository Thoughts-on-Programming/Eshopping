package com.niit.dao;

import java.util.List;

import com.niit.model.BillingAddress;

public interface BillingAddressDAO {
	
	BillingAddress insertBillingAddress(BillingAddress billingAddress);
	void deleteBillingAddress(int id);
	BillingAddress updateBillingAddress(BillingAddress billingAddress);	
	BillingAddress getBillingAddressById(int id);
	List<BillingAddress> getAllBillingAddresses();

}
