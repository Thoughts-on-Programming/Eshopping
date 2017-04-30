package com.niit.dao;

import java.util.List;

import com.niit.model.Supplier;

public interface SupplierDAO {
	
	Supplier insertSupplier(Supplier supplier);
	void deleteSupplier(int id);
	Supplier updateSupplier(Supplier supplier);	
	Supplier getSupplierById(int id);
	List<Supplier> getAllSuppliers();
	
}
