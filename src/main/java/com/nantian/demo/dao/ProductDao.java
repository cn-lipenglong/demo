package com.nantian.demo.dao;

import com.nantian.demo.domain.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDao {

	Integer add(Product product);
	Product findById(String id);
	List<Product> findAll();
}
