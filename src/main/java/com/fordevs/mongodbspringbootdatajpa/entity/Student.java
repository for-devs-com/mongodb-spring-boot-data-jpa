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
//Student is a document object in the student collection.
//Just like in SQL databases, Student is a row object in a table.
@Document(collection = "student")
public class Student {

    //remember to use @PersistenceContructor when you have more than one constructor for your collection
    @Id //the unique identifier. By default, auto generate it.
    private String id;
    private String name;
    private String email;
    private Department department;
    private List<Subject> subjects;
}
