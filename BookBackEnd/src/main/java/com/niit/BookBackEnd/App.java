package com.niit.BookBackEnd;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.*;
import com.niit.dao.*;
import com.niit.model.*;



public class App {
	public static void main(String[] args) {
		System.out.println("Before");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

		//1
		context.scan("com.niit");
		context.refresh();

		Books books = new Books();
		books.setId(4);
		books.setName("WG, WG");
		books.setPrice(900);
		books.setSummary("LGBTQ");
		books.setAuthor("JG, DL");

		// 2
		Category category = new Category();
		category.setId(4);
		category.setName("Non fiction");

		BookDAO bookDAO = context.getBean(BookDAOImpl.class);
		CategoryDAO categoryDAO = context.getBean(CategoryDAOImpl.class);
		bookDAO.insertBook(books);
		categoryDAO.insertCategory(category);

		List<Books> b = bookDAO.getAllBooks();
		System.out.println(b);
		
		Supplier supplier=new Supplier();
		supplier.setId(103);
		supplier.setName("JR Suppliers");
		supplier.setLocation("Mysore");
		
			
		SupplierDAO supplierDAO=context.getBean(SupplierDAOImpl.class);
		supplierDAO.insertSupplier(supplier);
		
		List<Supplier> s=supplierDAO.getAllSuppliers();
		System.out.println(s);
		
		ShippingAddress shippingAddress=new ShippingAddress();
		shippingAddress.setId(1);
		shippingAddress.setFlatOrDoorNo(2);
		shippingAddress.setName("Sai Sansar Nest");
		shippingAddress.setArea("Padmanbhanagar");
		shippingAddress.setStreet("RK Layout");
		shippingAddress.setCity("Bangalore");
		shippingAddress.setCountry("India");
		shippingAddress.setPinCode(560070);
		
		ShippingAddressDAO shippingAddressDAO=context.getBean(ShippingAddressDAOImpl.class);
		shippingAddressDAO.insertShippingAddress(shippingAddress);
		
		List<ShippingAddress> sh=shippingAddressDAO.getAllShippingAddresses();
		System.out.println(sh);
		BillingAddress billingAddress=new BillingAddress();
		billingAddress.setId(1);
		billingAddress.setFlatOrDoorNo(2);
		billingAddress.setName("Sai Sansar Nest");
		billingAddress.setArea("Padmanbhanagar");
		billingAddress.setStreet("RK Layout");
		billingAddress.setCity("Bangalore");
		billingAddress.setCountry("India");
		billingAddress.setPinCode(560070);
		
		BillingAddressDAO billingAddressDAO=context.getBean(BillingAddressDAOImpl.class);
		billingAddressDAO.insertBillingAddress(billingAddress);
		
		List<BillingAddress> bl=billingAddressDAO.getAllBillingAddresses();
		System.out.println(bl);
		
		System.out.println("After");
		context.close();

	}

}
