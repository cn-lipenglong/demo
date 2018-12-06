package com.nantian.demo.dao;

import com.nantian.demo.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {

	List<User> findAllUser();
}
