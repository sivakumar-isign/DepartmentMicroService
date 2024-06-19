package com.department.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.department.model.Department;
import com.department.service.DepartmentService;


@RestController
@RequestMapping("/departments")
public class DepartmentController {
	
	 @Autowired
	    private DepartmentService departmentService;

	    @PostMapping
	    public Department createDepartment(@RequestBody Department department) {
	        return departmentService.saveDepartment(department);
	    }

	    @GetMapping
	    public List<Department> getAllDepartments() {
	        return departmentService.getAllDepartments();
	    }

	    @GetMapping("/{id}")
	    public Department getDepartmentById(@PathVariable Long id) {
	        return departmentService.getDepartmentById(id);
	    }

	    @DeleteMapping("/{id}")
	    public void deleteDepartment(@PathVariable Long id) {
	        departmentService.deleteDepartment(id);
	    }

}
