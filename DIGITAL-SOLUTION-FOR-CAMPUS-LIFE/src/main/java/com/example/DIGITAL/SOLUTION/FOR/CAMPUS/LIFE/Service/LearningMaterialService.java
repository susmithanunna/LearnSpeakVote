package com.example.DIGITAL.SOLUTION.FOR.CAMPUS.LIFE.Service;

import com.example.DIGITAL.SOLUTION.FOR.CAMPUS.LIFE.Entity.Course;
import com.example.DIGITAL.SOLUTION.FOR.CAMPUS.LIFE.Entity.LearningMaterial;
import com.example.DIGITAL.SOLUTION.FOR.CAMPUS.LIFE.Repository.CourseRepository;
import com.example.DIGITAL.SOLUTION.FOR.CAMPUS.LIFE.Repository.LearningMaterialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LearningMaterialService {
    @Autowired
    private LearningMaterialRepository learningMaterialRepository;
    @Autowired
    private CourseRepository courseRepository;

    public void uploadMaterial(LearningMaterial material) {

        learningMaterialRepository.save(material);
    }

    public List<LearningMaterial> getMaterialsByCourse(Long courseId) {
        return learningMaterialRepository.findByCourseId(courseId);
    }


}
