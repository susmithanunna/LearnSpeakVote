package com.example.DIGITAL.SOLUTION.FOR.CAMPUS.LIFE.Service;

import com.example.DIGITAL.SOLUTION.FOR.CAMPUS.LIFE.Entity.Feedback;
import com.example.DIGITAL.SOLUTION.FOR.CAMPUS.LIFE.Repository.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedbackService {
    @Autowired
    private FeedbackRepository feedbackRepository;

    public void saveFeedback(Feedback feedback) {
        feedbackRepository.save(feedback);
    }

    public List<Feedback> getFeedbackForCourse(Long courseId) {
        return feedbackRepository.findByCourseId(courseId);
    }
}
