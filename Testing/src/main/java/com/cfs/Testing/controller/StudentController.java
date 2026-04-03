package com.cfs.Testing.controller;


import com.cfs.Testing.entity.student;
import com.cfs.Testing.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    public StudentService service;

    @GetMapping
    public List<student> getAll()
    {
        return service.getAll();
    }

    @PostMapping
    public student create(@RequestBody student student)
    {
        return service.addStudent(student);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id)
    {
        service.deleteStudent(id);
    }
}
