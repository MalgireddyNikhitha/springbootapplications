package com.example.studentinfo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.studentinfo.model.student;

public interface Studentrepo extends JpaRepository<student,Integer> {


}
