package com.tt.teach.service.impl;

import com.tt.teach.dao.StudentDao;
import com.tt.teach.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @作者：Shilinzhi
 * @时间：2018/12/19 14:34
 * @描述：
 *
 */
@Service
public class StudentServiceImp implements StudentService{
    @Resource
    private StudentDao studentDao;
}