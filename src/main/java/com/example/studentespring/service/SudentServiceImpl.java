package com.example.studentespring.service;

import com.example.studentespring.domain.Student;
import com.example.studentespring.repository.StudentRepository;
import com.example.studentespring.service.api.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class SudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    @Override
    public List<Student> getByName(String name) {
        List<Student> res = new ArrayList<>();
        for (Student s : studentRepository.findAll()) {
            if (s.getFirstName().toLowerCase().startsWith(name))
                res.add(s);
        }
        return res;
    }

    @Override
    public Student getById(int id) {
        try {
            return studentRepository.findById(id).orElseThrow();
        } catch (NoSuchElementException e) {
            return null;
        }
    }

    @Override
    public Student create(Student student) {
        student.setId(
                studentRepository.findAll().size()+1
        );
        return studentRepository.save(student);
    }

    @Override
    public void delete(int id) {
        studentRepository.delete(
                studentRepository.findById(id).get()
        );
    }
}
