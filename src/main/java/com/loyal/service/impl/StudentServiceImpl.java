/**
 * FileName: StudentServiceImpl
 * Author:   Dragon
 * Date:     2019/5/20 11:25
 * History:
 */
package com.loyal.service.impl;

import com.loyal.dao.StudentDao;
import com.loyal.entity.Student;
import com.loyal.service.StudentService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
public class StudentServiceImpl implements StudentService {
    private StudentDao studentDao;

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public List<Student> findAllStudents() {

        return studentDao.findAllStudents();
    }

    @Override
    public void saveStudent(Student student) {
        studentDao.saveStudent(student);
    }

    @Override
    public void delStudent(Student s) {
        studentDao.delStudent(s);
    }

    @Override
    public void updateStudent(Student student) {
        studentDao.updateStudent(student);
    }

    @Override
    public List countById() {
        return studentDao.countById();
    }

    @Override
    public int maxCountById() {

        return studentDao.maxCountById();
    }

    @Override
    public List<Student> findTopSubjects() {

        return studentDao.findTopSubjects();
    }
}
