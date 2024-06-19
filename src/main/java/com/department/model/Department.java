package com.department.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Department {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String deptName;
    private LocalDateTime createdDateTime;
    private String createdByUsername;
    private LocalDateTime updatedDateTime;
    private String updatedByUsername;
    
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(Long id, String deptName, LocalDateTime createdDateTime, String createdByUsername,
			LocalDateTime updatedDateTime, String updatedByUsername) {
		super();
		this.id = id;
		this.deptName = deptName;
		this.createdDateTime = createdDateTime;
		this.createdByUsername = createdByUsername;
		this.updatedDateTime = updatedDateTime;
		this.updatedByUsername = updatedByUsername;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public LocalDateTime getCreatedDateTime() {
		return createdDateTime;
	}

	public void setCreatedDateTime(LocalDateTime createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public String getCreatedByUsername() {
		return createdByUsername;
	}

	public void setCreatedByUsername(String createdByUsername) {
		this.createdByUsername = createdByUsername;
	}

	public LocalDateTime getUpdatedDateTime() {
		return updatedDateTime;
	}

	public void setUpdatedDateTime(LocalDateTime updatedDateTime) {
		this.updatedDateTime = updatedDateTime;
	}

	public String getUpdatedByUsername() {
		return updatedByUsername;
	}

	public void setUpdatedByUsername(String updatedByUsername) {
		this.updatedByUsername = updatedByUsername;
	}


    

}
