package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Customer;
import com.example.demo.model.SearchForm;
import com.example.demo.service.RestService;

@RestController
public class RootController {
	
	@Qualifier("RestServiceImpl")
	RestService service;
	
	@GetMapping("/customers")
	public List<Customer> selectMany(@RequestParam Map<String, String> params, Model model) {
		System.out.println("params : " + params);
		
		SearchForm searchForm = new SearchForm();
		searchForm.setName(params.get("name"));
		searchForm.setBirthdayFrom(params.get("birthdayFrom"));
		searchForm.setBirthdayTo(params.get("birthdayTo"));
		List<Customer> customers = service.selectMany(searchForm);
		
//		System.out.println("customers : " + customers);
		
		
		return customers;
	}
}
