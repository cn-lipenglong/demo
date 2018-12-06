package com.nantian.demo.service;

import com.nantian.demo.dao.UserDao;
import com.nantian.demo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserService {

	@Autowired
	private UserDao userDao;

	public List<User> findAllUser() {
		return userDao.findAllUser();
	}
}
