package com.example.demo.service.mybatis;

import java.util.List;

import com.example.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Customer;
import com.example.demo.model.SearchForm;
import com.example.demo.repository.mybatis.CustomerMapper;
import com.example.demo.service.RestService;

@Transactional
@Service("restServiceImpl")
public class RestServiceImpl  implements RestService {
//	@Autowired
//	CustomerMapper customerMapper;

	@Autowired
	CustomerRepository repository;

	@Override
	public List<Customer> selectMany(SearchForm searchForm) {
		return repository.selectMany(searchForm);
	}
}
