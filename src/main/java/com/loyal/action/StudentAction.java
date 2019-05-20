/**
 * FileName: StudentAction
 * Author:   Dragon
 * Date:     2019/5/20 11:13
 * History:
 */
package com.loyal.action;

import com.loyal.entity.Student;
import com.loyal.service.StudentService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;

public class StudentAction extends ActionSupport implements ModelDriven {

    private Student student = new Student();
    private StudentService studentService;
    @Override
    public Object getModel() {
        return student;
    }

    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    public String findAllStudents(){
        HttpServletRequest request = ServletActionContext.getRequest();
        request.setAttribute("students",studentService.findAllStudents());

        return SUCCESS;
    }

    public String saveStudentUI(){
        return SUCCESS;
    }

    public String saveStudent(){
        studentService.saveStudent(student);
        return SUCCESS;

    }

    public String delStudent(){
        studentService.delStudent(student);
        return SUCCESS;
    }

    public String updateStudentUI(){
        Integer id = (Integer) ServletActionContext.getRequest().getAttribute("id");
        return SUCCESS;
    }

    public String updateStudent(){
        studentService.updateStudent(student);
        return SUCCESS;
    }

    public String countById() throws IOException {
        List conunt = studentService.countById();

        ServletActionContext.getResponse().getWriter().print(conunt.get(0));
        return null;
    }

    public String maxCountById() throws IOException {
        ServletActionContext.getResponse().getWriter().print(studentService.maxCountById());
        return null;
    }
}
