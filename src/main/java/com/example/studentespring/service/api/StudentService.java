package com.example.studentespring.service.api;

import com.example.studentespring.domain.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAll();
    List<Student>getByName(String name);
    Student getById(int id);
    Student create(Student student);
    void delete(int id);
}
