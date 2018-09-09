package com.pattern.example.demo.dao.src;

import java.util.List;

public interface StudentDao {

    void save(Student student);

    List<Student> getAllStudents();

    Student getStudent(int rollNo);

    void updateStudent(Student student);

    void deleteStudent(Student student);

}