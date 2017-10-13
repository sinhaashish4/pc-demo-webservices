package com.pc.wish;

import java.util.Date;

import com.pc.address.Address;

public class Wish {

	private final int id;
	private final String name;
	private final String description;
	private final Date createdDate;
	private final Date endDate;
	private final Address desiredAddress;

	public Wish(int id, String name, String description, Date createdDate, Date endDate, Address desiredAddress) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.createdDate = createdDate;
		this.endDate = endDate;
		this.desiredAddress = desiredAddress;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public Address getDesiredAddress() {
		return desiredAddress;
	}

}
