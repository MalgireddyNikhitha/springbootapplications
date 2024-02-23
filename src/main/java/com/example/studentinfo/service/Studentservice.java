package com.example.studentinfo.service;

import com.example.studentinfo.model.student;
import com.example.studentinfo.repository.Studentrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class Studentservice {
    @Autowired
    private Studentrepo repo;
    public student createstudent(student student) {
        return repo.save(student);
    }
    public List<student> getstudents() {
        return repo.findAll();
    }

    public student getstudent(int id) {
        return repo.findById(id).orElse(null);
    }

    public List<student> createstudents(List<student> students) {
        return repo.saveAll(students);
    }
    public String deletestudent(int id) {
        repo.deleteById(id);
        return "student data is deleted with  " + id;
    }

    public student updatestudent(int id, student updatedStudent) {
        Optional<student> optionalStudent = repo.findById(id);
        if (optionalStudent.isPresent()) {
            student existingStudent = optionalStudent.get();
            existingStudent.setName(updatedStudent.getName());
            existingStudent.setAddress(updatedStudent.getAddress());
            existingStudent.setEmail(updatedStudent.getEmail());
            existingStudent.setPhone(updatedStudent.getPhone());
            existingStudent.setCourse(updatedStudent.getCourse());
            existingStudent.setDepartment(updatedStudent.getDepartment());
            existingStudent.setSemester(updatedStudent.getSemester());
            existingStudent.setSection(updatedStudent.getSection());
            existingStudent.setRoll(updatedStudent.getRoll());
            existingStudent.setPassword(updatedStudent.getPassword());
            return repo.save(existingStudent);
        } else {
            throw new RuntimeException("Student not found with id: " + id);
        }
    }


}
