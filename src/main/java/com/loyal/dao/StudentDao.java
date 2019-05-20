package com.loyal.dao;

import com.loyal.entity.Student;

import java.util.List;

public interface StudentDao {
    List<Student> findAllStudents();

    void saveStudent(Student student);

    void delStudent(Student s);

    void updateStudent(Student student);

    List countById();

    int maxCountById();
}
