package com.fordevs.mongodbspringbootdatajpa.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
public class Subject {

	@Field(name = "subject_name")
	private String subjectName;
	@Field(name = "marks_obtained")
	private int marksObtained;

}
