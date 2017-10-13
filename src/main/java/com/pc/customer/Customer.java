package com.pc.customer;

import java.util.List;

import com.pc.address.Address;
import com.pc.wish.Wish;

public class Customer {
	private final Integer id;
	private final String name;
	private final int age;
	private final char sex;
	private final Address address;
	private final List<Wish> wishList;

	public Customer(Integer id, String name, int age, char sex, Address address, List<Wish> wishList) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.address = address;
		this.wishList = wishList;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public char getSex() {
		return sex;
	}

	public Address getAddress() {
		return address;
	}

	public List<Wish> getWishList() {
		return wishList;
	}

}
