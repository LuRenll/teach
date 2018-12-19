package com.tt.teach.controller;

import com.sun.org.apache.regexp.internal.RE;
import com.tt.teach.pojo.Student;
import com.tt.teach.service.StudentService;
import com.tt.teach.utils.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @作者：Shilinzhi
 * @时间：2018/12/19 14:33
 * @描述：
 */
@Controller
@RequestMapping("/stu")
public class StudentController extends BaseController{
    @Resource
    private StudentService studentService;

    @RequestMapping("/login")
    //接口：http://localhost:8080/stu/login
    public String login() {
        return "/student/login";
    }

    @RequestMapping("/index")
    //接口：http://localhost:8080/stu/index
    public String index() {
        String studentName = (String) getSession().getAttribute(SESSION_KEY);
        if (studentName != null) {
            return "/student/index";
        }
        return REDIRECT+"/stu/login";
    }

    @RequestMapping("/student")
    //接口：http://localhost:8080/stu/student
    public String student() {
        return "/student/student";
    }

    @RequestMapping(value = "/doLogin", method = RequestMethod.POST)
    //接口：http://localhost:8080/stu/doLogin
    public String doLogin() {
        String xuehao = getRequest().getParameter("studentNo");
        Integer studentNo = Integer.parseInt(xuehao);
        String loginPwd = getRequest().getParameter("loginPwd");
        Student student = new Student();
        student.setStudentNo(studentNo);
        student.setLoginPwd(loginPwd);
        Student student1 = studentService.doLogin(student);
        if (student1 != null) {
            getSession().setAttribute(SESSION_KEY, student1.getStudentName());
            return FORWARD+"/stu/index";
        }
        return REDIRECT+"/stu/login";
    }

    @RequestMapping("/logout")
    public String logout(HttpSession session) {
        session.removeAttribute(SESSION_KEY);
        return REDIRECT+"/stu/login";
    }

    @RequestMapping(value = "/getStudentList",method = RequestMethod.GET)
    @ResponseBody
    public Object getStudentList() {
        List<Student> list = studentService.getStudentList();
        return list;
    }

    @RequestMapping(value = "/deleteStudent",method = RequestMethod.POST)
    public String deleteStudent() {
        return "明儿  见";
    }
}
