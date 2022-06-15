package com.fordevs.mongodbspringbootdatajpa.repository;

import com.fordevs.mongodbspringbootdatajpa.entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

//StudentRepository maps Student class to Student collection in mongo database
public interface StudentRepository extends MongoRepository<Student, String> {
}
