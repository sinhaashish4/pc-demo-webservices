package com.pc.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/customers")
public class CustomerService {

	@Autowired
	private CustomerMock mock;

	@GetMapping
	public List<Customer> getList() {
		return mock.getList();
	}

	@GetMapping("/{id}")
	public Customer get(@PathVariable("id") Integer id) throws Exception {
		return this.getList().stream().filter(customer -> customer.getId().equals(id)).findFirst().get();
	}

}
