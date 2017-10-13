package com.pc.customer;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.pc.address.Address;
import com.pc.wish.Wish;

@Service
public class CustomerMock {
	public List<Customer> getList() {
		Address a1 = new Address(1,"31 Bramshott Place", null, null, "Fleet", "Hampshire", "GU51 4QF", "UK");
		
		Wish w1 = new Wish(1, "Organic Milk", "Home delivery of 2 liters of organic milk every morning", new Date(), null, a1);
		Wish w2 = new Wish(1, "Fresh Vegitables", "Home delivery of fresh vegitables every 3 days", new Date(), null, a1);
		Wish w3 = new Wish(1, "Fresh Fruits", "Home delivery of fresh fruits every week", new Date(), null, a1);
		List<Wish> wList1 = Arrays.asList(w1, w2, w3);
		
		Customer c1 = new Customer(11, "Ash", 35, 'M', a1, wList1); 

		return Arrays.asList(c1);
	}

}
