package com.fordevs.mongodbspringbootdatajpa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
//Student is document/row in the student collection/table
@Document(collection = "student")
public class Student {

    @Id //the unique identifier
    private String id;
    private String name;
    private String email;
    private Department department;
    private List<Subject> subjects;


}
