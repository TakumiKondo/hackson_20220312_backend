package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Customer;
import com.example.demo.model.SearchForm;

public interface RestService {
//	public boolean add(Item item);
	
	public List<Customer> selectMany(SearchForm searchForm);
	
//	public Item get(Integer id);
//	
//	public boolean update(Item item);
//	
//	public boolean delete(Integer id);
}
