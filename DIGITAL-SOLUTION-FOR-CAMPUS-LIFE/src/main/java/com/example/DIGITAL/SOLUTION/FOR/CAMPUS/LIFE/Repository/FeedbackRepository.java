package com.example.DIGITAL.SOLUTION.FOR.CAMPUS.LIFE.Repository;

import com.example.DIGITAL.SOLUTION.FOR.CAMPUS.LIFE.Entity.Feedback;
import com.example.DIGITAL.SOLUTION.FOR.CAMPUS.LIFE.Entity.LearningMaterial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FeedbackRepository extends JpaRepository<Feedback,Long> {
    List<Feedback> findByCourseId(Long courseId);
}
