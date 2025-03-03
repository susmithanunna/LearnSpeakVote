package com.example.DIGITAL.SOLUTION.FOR.CAMPUS.LIFE.Service;

import com.example.DIGITAL.SOLUTION.FOR.CAMPUS.LIFE.Entity.Assignments;
import com.example.DIGITAL.SOLUTION.FOR.CAMPUS.LIFE.Repository.AssignmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssignmentService {
    @Autowired
    AssignmentRepository assignmentRepository;

    public void save(Assignments assignment){
         assignmentRepository.save(assignment);
    }

    public List<Assignments> getAssignment(Long studentId, Long courseId){
        return assignmentRepository.getAssignment(studentId,courseId);
    }
}
