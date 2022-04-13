package com.example.studentespring.repository;

import com.example.studentespring.domain.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends MongoRepository<Student, Integer> {

}
