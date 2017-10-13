package com.pc.seller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/sellers")
public class SellerService {

	@Autowired
	private SellerMock mock;

	@GetMapping
	public List<Seller> getList() {
		return mock.getList();
	}

	@GetMapping("/{id}")
	public Seller get(@PathVariable("id") Integer id) {
		return this.getList().stream().filter(s -> s.getId().equals(id)).findFirst().get();
	}
}
