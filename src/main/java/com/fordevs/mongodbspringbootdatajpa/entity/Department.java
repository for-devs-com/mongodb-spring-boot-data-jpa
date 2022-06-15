package com.fordevs.mongodbspringbootdatajpa.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
public class Department {

	//Field is use to map the variable name to the database field name
	@Field(name = "department_name")
	private String departmentName;
	private String location;
}
