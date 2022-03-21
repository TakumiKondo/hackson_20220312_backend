package com.example.demo.repository;

import com.example.demo.model.Customer;
import com.example.demo.model.SearchForm;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CustomerRepository {
    List<Customer> selectMany(SearchForm searchForm);

    void save(Customer customer);

    Customer selectOne(String id);
}

