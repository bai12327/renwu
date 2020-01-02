package com.example.demo.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.empjie;
import com.example.demo.pojo.da;

@Service
public class empbiz {
	
	@Autowired
	private empjie dao;
	
		public List<da> queryAllda(){
			return dao.queryAllda();
		}
}
