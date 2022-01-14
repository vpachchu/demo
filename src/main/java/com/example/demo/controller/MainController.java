package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    StudentService studentService;

    @RequestMapping (value = "/hello",method = RequestMethod.GET)
    public String greeting1()
    {
        return "Hello Spring from get";
    }

    @RequestMapping (value = "/hello",method = RequestMethod.POST)
    public String greeting2()
    {
        return "Hello Spring from post";
    }

    @RequestMapping(value="/student",method = RequestMethod.POST)
     public Student save(Student student)
     {
        return studentService.save(student);
     }


}
