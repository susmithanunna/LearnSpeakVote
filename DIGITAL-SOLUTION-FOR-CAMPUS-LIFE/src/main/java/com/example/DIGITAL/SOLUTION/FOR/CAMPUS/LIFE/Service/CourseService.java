package com.example.DIGITAL.SOLUTION.FOR.CAMPUS.LIFE.Service;

import com.example.DIGITAL.SOLUTION.FOR.CAMPUS.LIFE.Entity.Course;
import com.example.DIGITAL.SOLUTION.FOR.CAMPUS.LIFE.Repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    CourseRepository courseRepository;

    public Course getCourseById(Long id){
        return courseRepository.getById(id);
    }
    public void addCourse(Course course){
         courseRepository.save(course);
    }
    public List<Course> getAll(){
        return courseRepository.findAll();
    }
}
