package org.example.entities;
import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Student {
    @Id
    private long id;

    @Column(name = "student_name")
    private String studentName;

    private int rollno;

    @Temporal(TemporalType.DATE)
    private Date birthdate;
    @Transient
    @Column(name = "full_name")
    private String fullName;
    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
