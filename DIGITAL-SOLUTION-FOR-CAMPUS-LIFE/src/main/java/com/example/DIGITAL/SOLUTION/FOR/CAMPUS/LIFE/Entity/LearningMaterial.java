package com.example.DIGITAL.SOLUTION.FOR.CAMPUS.LIFE.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class LearningMaterial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long courseId;
    private String fileUrl;

    public LearningMaterial() {
    }

    public LearningMaterial(Long courseId, String fileUrl) {
        this.courseId = courseId;
        this.fileUrl = fileUrl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
