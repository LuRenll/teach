package com.tt.teach.controller;

import com.tt.teach.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @作者：Shilinzhi
 * @时间：2018/12/19 14:33
 * @描述：
 *
 */
@Controller
@RequestMapping("/stu")
public class StudentController {
    @Resource
    private StudentService studentService;
}
