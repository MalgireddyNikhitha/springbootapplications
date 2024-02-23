package com.example.studentinfo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class student {
    @Id
    @Generated
    public int id;
    public String name;
    public String email;
    public String address;
    public String phone;
    public String course;
    public String department;

    public String semester;
    public String section;
    public String roll;
    public String password;

}
