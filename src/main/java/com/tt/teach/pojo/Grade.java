package com.tt.teach.pojo;

import java.io.Serializable;
/**
 * @作者：Shilinzhi
 * @时间：2018/12/19 14:31
 * @描述：实体类——>年级Grade对应数据库表
 *
 */
public class Grade implements Serializable{
    private Integer gradeID;
    private String gradeName;

    public Integer getGradeID() {
        return gradeID;
    }

    public void setGradeID(Integer gradeID) {
        this.gradeID = gradeID;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }

    public Grade(Integer gradeID, String gradeName) {
        this.gradeID = gradeID;
        this.gradeName = gradeName;
    }

    public Grade() {
    }
}
