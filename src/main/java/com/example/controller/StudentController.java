package com.example.controller;

import com.example.dao.StuDao;
import com.example.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StuDao stuDao;

    @GetMapping("save")
    public String save(Student student){
        stuDao.save(student);
        return "success";
    }
}
