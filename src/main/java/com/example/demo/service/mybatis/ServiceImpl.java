package com.example.demo.service.mybatis;

import com.example.demo.model.Customer;
import com.example.demo.model.SearchForm;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.service.RestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service("ServiceImpl")
public class ServiceImpl implements RestService {

	@Autowired
	CustomerRepository repository;

	@Override
	public List<Customer> selectMany(SearchForm searchForm) {
		return repository.selectMany(searchForm);
	}

	@Override
	public void save(Customer customer) {
		repository.save(customer);
	}

	@Override
	public Customer selectOne(String id) {
		return repository.selectOne(id);
	}

	@Override
	public void update(Customer customer) {
		repository.update(customer);
	}

	@Override
	public void delete(String id) {
		repository.delete(id);
	}

}
