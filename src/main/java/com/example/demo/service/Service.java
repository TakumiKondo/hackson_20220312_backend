package com.example.demo.service;

import com.example.demo.model.Customer;
import com.example.demo.model.SearchForm;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface Service {
	List<Customer> selectMany(SearchForm searchForm);

    void save(Customer customer);

    Customer selectOne(String id);
}
