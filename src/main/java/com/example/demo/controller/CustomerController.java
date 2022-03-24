package com.example.demo.controller;

import com.example.demo.model.Customer;
import com.example.demo.model.SearchForm;
import com.example.demo.service.RestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CustomerController {
	private static final Logger LOGGER = LoggerFactory.getLogger(CustomerController.class);

	@Qualifier("ServiceImpl")
	@Autowired
	RestService service;

	@GetMapping("/search")
	public String search() {
		return "search";
	}

	@GetMapping("/customers")
	public String selectMany(@Validated SearchForm form, Model model) {
		List<Customer> customers = service.selectMany(form);
		LOGGER.info("customers : " + customers);
		model.addAttribute("customers", customers);
		return "search";
	}

	@GetMapping("/add")
	public String add(Model model) {
		return "add";
	}

	@PostMapping("/save")
	public String save(@Validated Customer customer, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return add(model);
		}
		service.save(customer);
		return "add";
	}

	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") String id, Model model) {
		Customer customer = service.selectOne(id);
		model.addAttribute("customer", customer);
		return "edit";
	}

	@PostMapping("/update")
	public String update(@Validated Customer customer, BindingResult result, Model model) {
		if (result.hasErrors()) {
			model.addAttribute("customer", customer);
			return "edit";
		}
		service.update(customer);
		return "search";
	}

	@PostMapping("/delete")
	public String delete(@RequestParam String id, Model model) {
		service.delete(id);
		return "search";
	}

	@GetMapping("/detail/{id}")
	public String detail(@PathVariable("id") String id, Model model) {
		Customer customer = service.selectOne(id);
		model.addAttribute("customer", customer);
		return "detail";
	}
}
