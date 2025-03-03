package com.example.DIGITAL.SOLUTION.FOR.CAMPUS.LIFE.Entity;

import jakarta.persistence.*;

@Entity
public class Assignments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long studentId;

    private Long courseId ;

    private String fileUrl;  // Stores the PDF file location
    public Assignments() {
    }
    public Assignments( Long studentId, Long courseId, String fileUrl) {
        this.studentId= studentId;
        this.courseId = courseId;
        this.fileUrl = fileUrl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }
}
