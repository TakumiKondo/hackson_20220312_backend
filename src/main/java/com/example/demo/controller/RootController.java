package com.example.demo.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Customer;
import com.example.demo.model.History;
import com.example.demo.model.SearchForm;
import com.example.demo.model.Ticket;
import com.example.demo.service.RestService;

@RestController
public class RootController {
	private static final Logger LOGGER = LoggerFactory.getLogger(RootController.class);

	@Qualifier("restServiceImpl")
	@Autowired
	RestService service;
	
	@PostMapping("/customer")
	public String add(@Validated Customer customer, Model model) {
		LOGGER.info("adding is " + customer);
		service.save(customer);
		return "{\"result\":\"ok\"}";
	}
	
	@GetMapping("/customers/{id}")
	public Customer selectOne(@PathVariable String id, Model model) {
		System.out.println("id : " + id);
		
		Customer c1 = new Customer();
		c1.setId(111);
		c1.setName("田中 太郎");
		c1.setBirthday(LocalDate.of(1995, 7, 2));
		c1.setGender("男性");
	
//		Ticket t1 = new Ticket();
//		t1.setId(234);
//		t1.setPaymentCode("1");
//		t1.setPaymentName("10回払い");
//		t1.setRemaining(8);
//		Ticket t2 = new Ticket();
//		t2.setId(235);
//		t2.setPaymentCode("3");
//		t2.setPaymentName("月会員");
//		t2.setRemaining(null);
//		List<Ticket> tickets1 = new ArrayList<>(Arrays.asList(t1, t2));
//		c1.setPaymentName("10回払い");
		
		System.out.println("Customer : " + c1);
		
		return c1;
	}
	
	@GetMapping("/customers")
	public List<Customer> selectMany(@Validated SearchForm form) {
		LOGGER.info("search param is " + form);
		List<Customer> customers = service.selectMany(form);
		return customers;
	}
	
	@GetMapping("/history")
	public Customer getOne(@RequestParam Map<String, String> params, Model model) {
		Customer c1 = new Customer();
		c1.setId(111);
		c1.setName("AA");
		c1.setBirthday(LocalDate.of(1995, 7, 2));
		c1.setGender("男性");
		History h1 = new History();
		History h2 = new History();
		h1.setId(123);
		h2.setId(124);
		h1.setUseDate(LocalDate.of(2022, 1, 10));
		h2.setUseDate(LocalDate.of(2022, 2, 15));
		h1.setStoreId(1);
		h2.setStoreId(2);
		h1.setStaffId(1);
		h2.setStaffId(2);
		List<History> histories = Arrays.asList(h1, h2);
		c1.setHistories(histories);
		
//		Ticket t1 = new Ticket();
//		t1.setId(301);
//		t1.setPaymentCode("1");
//		t1.setPaymentName("10回払い");
//		t1.setRemaining(8);
//		c1.setPaymentName("10回払い");
		
		System.out.println("customer : " + c1);
		
		return c1;
	}
	
}
