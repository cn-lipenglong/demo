package com.nantian.demo.dao;

import com.nantian.demo.domain.Orders;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrdersDao {
	void add(Orders orders);
	int update(Orders orders);
	List<Orders> findAll();
	Orders findById(String id);
}
