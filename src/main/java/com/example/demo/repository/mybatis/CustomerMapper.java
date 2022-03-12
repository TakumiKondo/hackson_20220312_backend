package com.example.demo.repository.mybatis;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.Customer;
import com.example.demo.model.SearchForm;

@Mapper
public interface CustomerMapper {
	
	public List<Customer> selectMany(SearchForm searchForm);

}
