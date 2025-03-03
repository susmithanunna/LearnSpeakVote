package com.example.DIGITAL.SOLUTION.FOR.CAMPUS.LIFE.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    @ManyToOne
    private User organizer;
}
