package com.example.demo.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.biz.empbiz;
import com.example.demo.pojo.da;

@RestController
@RequestMapping("/api/persons") 
public class empaction {
	@Autowired
	private empbiz biz;
	public List<da> queryAllda(){
		return biz.queryAllda();
	}
}
