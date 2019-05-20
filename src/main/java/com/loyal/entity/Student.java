/**
 * FileName: Student
 * Author:   Dragon
 * Date:     2019/5/20 11:15
 * History:
 */
package com.loyal.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Setter
@Getter
@ToString
@Entity
@Table(name = "s_student")
public class Student implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "subject")
    private String subject;
    @Column(name = "score")
    private Integer score;
}
