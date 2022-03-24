package com.example.demo.controller;

import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Customer;
import com.example.demo.model.SearchForm;
import com.example.demo.service.RestService;

@RestController
public class RootController {
	private static final Logger LOGGER = LoggerFactory.getLogger(RootController.class);

	@Qualifier("restServiceImpl")
	@Autowired
	RestService service;
	
//	@PostMapping("/customer")
//	public String add(@Validated Customer customer) {
//		LOGGER.info("adding is " + customer);
//		service.save(customer);
//		return "{\"status\":\"200\"}";
//	}
	
	@GetMapping("/customer/{id}")
	public Customer selectOne(@PathVariable String id) {
		LOGGER.info("id is " + id);
		return service.selectOne(id);
	}
	
//	@GetMapping("/customers")
//	public List<Customer> selectMany(@Validated SearchForm form) {
//		LOGGER.info("search param is " + form);
//		return service.selectMany(form);
//	}

}
