package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Customer;
import com.example.demo.model.SearchForm;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface RestService {
	List<Customer> selectMany(SearchForm searchForm);

    void save(Customer customer);

    Customer selectOne(String id);
}
