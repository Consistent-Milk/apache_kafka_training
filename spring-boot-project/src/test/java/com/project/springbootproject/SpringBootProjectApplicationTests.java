package com.project.springbootproject;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.project.springbootproject.service.DepartmentService;

@SpringBootTest
class SpringBootProjectApplicationTests {

	@Autowired
	private DepartmentService departmentService;
	
	@Test
	void contextLoads() {
	}

	public void whenValidDepartmentName_DepartmentShouldBeFound() {
		
	}

}
