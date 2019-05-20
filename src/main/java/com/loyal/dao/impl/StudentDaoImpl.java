/**
 * FileName: StudentDaoImpl
 * Author:   Dragon
 * Date:     2019/5/20 11:27
 * History:
 */
package com.loyal.dao.impl;

import com.loyal.dao.StudentDao;
import com.loyal.entity.Student;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;


import java.util.List;

public class StudentDaoImpl extends HibernateDaoSupport implements StudentDao {
    @Override
    public List<Student> findAllStudents() {
        String hql = "from Student";

        return (List<Student>) getHibernateTemplate().find(hql);
    }

    @Override
    public void saveStudent(Student student) {
        getHibernateTemplate().save(student);
    }

    @Override
    public void delStudent(Student s) {
        getHibernateTemplate().delete(s);
    }

    @Override
    public void updateStudent(Student student) {
        Student student1 = getHibernateTemplate().get(student.getClass(), student.getId());
        student1.setName(student.getName());
        student1.setSubject(student.getSubject());
        student1.setScore(student.getScore());
        getHibernateTemplate().update(student1);
    }

    @Override
    public List countById() {
        String sql = "SELECT * FROM (SELECT SUM(score) AS zongfen" +
                " FROM s_student GROUP BY `name`) AS s" +
                " ORDER BY zongfen DESC;";
        return (List) getHibernateTemplate().execute(new HibernateCallback() {
            @Override
            public Object doInHibernate(Session session) throws HibernateException {
                Query query = session.createSQLQuery(sql);
                return query.list();
            }
        });
    }

    @Override
    public int maxCountById() {
        String hql = "from Student where score = (select max(score) from Student)";
        Student student = (Student) getHibernateTemplate().find(hql).listIterator().next();

        return student.getScore();
    }
}
