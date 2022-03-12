package com.example.demo.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Customer;
import com.example.demo.model.SearchForm;
import com.example.demo.model.Ticket;
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

//		service.selectMany(searchForm);
		Customer c1 = new Customer();
		c1.setId(1);
		c1.setName("AAA");
		c1.setBirthday(LocalDate.of(1995, 1, 1));
		c1.setGender("1");
		Ticket t1 = new Ticket();
		t1.setId(234);
		t1.setPaymentCode("1");
		t1.setPaymentName("10回払い");
		t1.setRemaining(8);
		Ticket t2 = new Ticket();
		t2.setId(235);
		t2.setPaymentCode("3");
		t2.setPaymentName("月会員");
		t2.setRemaining(null);
		List<Ticket> tickets1 = new ArrayList<>(Arrays.asList(t1, t2));
		c1.setTickets(tickets1);

		Customer c2 = new Customer();
		c2.setId(1);
		c2.setName("AAB");
		c2.setBirthday(LocalDate.of(1995, 9, 2));
		c2.setGender("2");
		Ticket t3 = new Ticket();
		t3.setId(236);
		t3.setPaymentCode("4");
		t3.setPaymentName("年会員");
		t3.setRemaining(null);
		List<Ticket> tickets2 = new ArrayList<>(Arrays.asList(t3));
		c2.setTickets(tickets2);
		
		List<Customer> customers = Arrays.asList(c1, c2);		
		
		System.out.println("customers : " + customers);
		
		
		return customers;
	}
}
