package com.pc.seller;

import java.util.List;

import com.pc.address.Address;
import com.pc.wish.Wish;

public class Seller {
	private Integer id;
	private String name;
	private Address address;
	private List<Wish> wishList;

	public Seller(Integer id, String name, Address address, List<Wish> wishList) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.wishList = wishList;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Address getAddress() {
		return address;
	}

	public List<Wish> getWishList() {
		return wishList;
	}
}
