package com.department.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.department.model.Department;
import com.department.repository.DepartmentRepository;

@Service
public class DepartmentService {
	  @Autowired
	    private DepartmentRepository departmentRepository;

	    public Department saveDepartment(Department department) {
	        return departmentRepository.save(department);
	    }

	    public List<Department> getAllDepartments() {
	        return departmentRepository.findAll();
	    }

	    public Department getDepartmentById(Long id) {
	        return departmentRepository.findById(id).orElse(null);
	    }

	    public void deleteDepartment(Long id) {
	        departmentRepository.deleteById(id);
	    }

}
