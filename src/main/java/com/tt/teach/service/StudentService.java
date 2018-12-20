package com.tt.teach.service;
import com.tt.teach.pojo.Student;

import java.util.List;

/**
 * @作者：Shilinzhi
 * @时间：2018/12/19 15:21
 * @描述：
 *
 */
public interface StudentService {

    Student doLogin(Student student);

    List<Student> getStudentList();

    int updateStudent(Student student);

    int deleteStudent(Integer stuNo);
}
