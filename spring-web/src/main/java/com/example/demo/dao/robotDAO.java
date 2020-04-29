package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.robot.Robot;

public interface robotDAO extends CrudRepository<Robot, Integer>{
	
}
