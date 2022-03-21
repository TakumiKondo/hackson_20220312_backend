package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Customer;
import com.example.demo.model.SearchForm;

public interface RestService {
	List<Customer> selectMany(SearchForm searchForm);

    void save(Customer customer);
}
