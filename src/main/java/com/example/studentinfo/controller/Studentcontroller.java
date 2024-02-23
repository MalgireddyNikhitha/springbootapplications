package com.example.studentinfo.controller;

import com.example.studentinfo.model.student;
import com.example.studentinfo.service.Studentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sriindu")


public class Studentcontroller {
    @Autowired
    private Studentservice service;
    @PostMapping("/addstudent")
    public student addstudent(@RequestBody student student) {
        return service.createstudent(student);
    }
    @PostMapping ("/addstudents")
    public List<student> addstudents(@RequestBody List<student> students){
        return service.createstudents(students);
    }
    @GetMapping("/getstudents")
    public List<student> getstudents(){
        return service.getstudents();
    }
    @GetMapping("/getstudent/{id}")
    public student getstudent(@PathVariable int id){
        return service.getstudent(id);
    }
    @DeleteMapping("/student/{id}")
    public String deletestudent(@PathVariable int id){
        return service.deletestudent(id);
    }
    @PutMapping("/student/{id}")
    public student updatestudent(@PathVariable int id,@RequestBody student student){
        return service.updatestudent(id, student);
    }

}
