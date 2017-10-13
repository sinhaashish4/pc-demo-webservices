package com.pc.address;

public class Address {
	private final int id;
	private final String firstLine;
	private final String secondLine;
	private final String thirdLine;
	private final String city;
	private final String region;
	private final String postCode;
	private final String country;

	public Address(int id, String firstLine, String secondLine, String thirdLine, String city, String region,
			String postCode, String country) {
		super();
		this.id = id;
		this.firstLine = firstLine;
		this.secondLine = secondLine;
		this.thirdLine = thirdLine;
		this.city = city;
		this.region = region;
		this.postCode = postCode;
		this.country = country;
	}

	public int getId() {
		return id;
	}

	public String getFirstLine() {
		return firstLine;
	}

	public String getSecondLine() {
		return secondLine;
	}

	public String getThirdLine() {
		return thirdLine;
	}

	public String getCity() {
		return city;
	}

	public String getRegion() {
		return region;
	}

	public String getPostCode() {
		return postCode;
	}

	public String getCountry() {
		return country;
	}

}
