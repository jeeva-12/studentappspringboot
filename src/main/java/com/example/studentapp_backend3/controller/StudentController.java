package com.example.studentapp_backend3.controller;


import com.example.studentapp_backend3.dao.StudentDao;
import com.example.studentapp_backend3.model.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
public class StudentController {
@Autowired
private StudentDao dao;


    @CrossOrigin(origins = "*")
    @PostMapping(path = "/add",consumes = "application/json",produces ="application/json")
    public String AddStudents(@RequestBody Students s)

    {
        System.out.println(s.getName().toString());
        return "Student added successfully";
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/search",consumes = "application/json",produces = "application/json")
    public List<Students> SearchStu(@RequestBody Students s)
    {
        String rollno=String.valueOf(s.getRollno());
        System.out.println(rollno);
        return ((List<Students>) dao.Searchstu(s.getRollno()));
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<Students> ViewAll(){
        return (List<Students>) dao.findAll();
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/deletestu",consumes = "application/json",produces = "application/json")
    public HashMap<String,String> deleteStu(@RequestBody Students s){
        String stuid=String.valueOf(s.getId());
        System.out.println(stuid);
        HashMap<String,String> map=new HashMap<>();
        map.put("status","success");
        return map;
    }
}
