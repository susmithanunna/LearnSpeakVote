package com.example.DIGITAL.SOLUTION.FOR.CAMPUS.LIFE.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Course course;

    private String comments;
}
