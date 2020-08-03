package com.ashish.student.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.ashish.student.dal.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
