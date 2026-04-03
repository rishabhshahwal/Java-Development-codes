package com.cfs.Testing.service;

import com.cfs.Testing.entity.student;
import com.cfs.Testing.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;


    public List<student> getAll()
    {
        return studentRepository.findAll();
    }

    public student addStudent(student student)
    {
        if(studentRepository.existsByEmail(student.getEmail()))
        {
            throw new IllegalArgumentException("Email already exists");
        }
        return studentRepository.save(student);
    }

    public void deleteStudent(Long id)
    {
        studentRepository.deleteById(id);
    }
}
