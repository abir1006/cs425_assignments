package org.example.model;

import java.time.LocalDateTime;

public class Student {
    private Integer id;
    private String name;
    private String dateOfAdmission;

    public Student() {
    }

    public Student(Integer id, String name, String dateOfAdmission) {
        this.id = id;
        this.name = name;
        this.dateOfAdmission = dateOfAdmission;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfAdmission;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfAdmission = dateOfBirth;
    }

    public int getAdmissionYear() {
        return Integer.parseInt(dateOfAdmission.split("/")[2]);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateOfAdmission=" + dateOfAdmission +
                '}';
    }
}
