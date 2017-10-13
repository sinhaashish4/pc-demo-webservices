package com.pc.seller;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.pc.address.Address;
import com.pc.wish.Wish;

@Service
public class SellerMock {
	public List<Seller> getList() {
		Address a1 = new Address(1,"31 Bramshott Place", null, null, "Fleet", "Hampshire", "GU51 4QF", "UK");
		
		Wish w1 = new Wish(1, "Organic Milk, Yogurt, Butter", "Home delivery near in fleet area", new Date(), null, a1);
		List<Wish> wList1 = Arrays.asList(w1);
		
		Seller s1 = new Seller(22, "Poonam Dairy Farm", a1, wList1);
		return Arrays.asList(s1);
	}
}
