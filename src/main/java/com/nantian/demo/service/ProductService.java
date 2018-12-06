package com.nantian.demo.service;

import com.nantian.demo.dao.ProductDao;
import com.nantian.demo.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProductService {

	@Autowired
	private ProductDao productDao;

	public Integer add(Product product) {
		return productDao.add(product);
	};

	public Product findById(String id) {
		return productDao.findById(id);
	}

	public List<Product> findAll() {
		return productDao.findAll();
	}

}
