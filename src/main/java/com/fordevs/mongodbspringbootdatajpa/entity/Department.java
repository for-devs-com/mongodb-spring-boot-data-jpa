package com.fordevs.mongodbspringbootdatajpa.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
public class Department {

	@Field(name = "department_name")
	private String departmentName;
	private String location;
}
