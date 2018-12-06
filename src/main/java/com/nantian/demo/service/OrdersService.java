package com.nantian.demo.service;

import com.nantian.demo.dao.OrdersDao;
import com.nantian.demo.domain.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class OrdersService {

	@Autowired
	private OrdersDao ordersDao;

	public void add(Orders orders) {
		ordersDao.add(orders);
	}

	public void update(Orders orders) {
		ordersDao.update(orders);
	}

	public List<Orders> findAll() {
		return ordersDao.findAll();
	}

	public Orders findById(String id) {
		return ordersDao.findById(id);
	}


}
