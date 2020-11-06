package com.kuang.pojo;

import java.util.List;

public class Teacher {
    private int id;
    private String name;

    //一个老师有多个学生
    private List<Student > students;
}
