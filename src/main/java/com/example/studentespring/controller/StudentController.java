package com.example.studentespring.controller;

import com.example.studentespring.domain.Student;
import com.example.studentespring.service.api.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Locale;

@RestController
@CrossOrigin
@RequestMapping("students")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping
    public List<Student> getAll(){
        return studentService.getAll();
    }

    @GetMapping(path="/id")
    public Student getById(@RequestParam int id){
        return studentService.getById(id);
    }

    @GetMapping(path="/name")
    public List<Student> getByname(@RequestParam String name){
        return studentService.getByName(name.toLowerCase());
    }

    @PostMapping
    public Student create(@RequestBody Student student){

        return studentService.create(student);
    }

    @GetMapping(path="/delete")
    public void delete(@RequestParam int id){
        studentService.delete(id);
    }
}
