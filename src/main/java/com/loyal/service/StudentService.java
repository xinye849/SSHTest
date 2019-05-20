package com.loyal.service;

import com.loyal.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAllStudents();

    void saveStudent(Student student);

    void delStudent(Student s);

    void updateStudent(Student student);

    List countById();

    int maxCountById();

}
