package com.codefun.practicesystem.service;

import com.codefun.practicesystem.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
