package com.example.DIGITAL.SOLUTION.FOR.CAMPUS.LIFE.Controller;

import com.example.DIGITAL.SOLUTION.FOR.CAMPUS.LIFE.Entity.Course;
import com.example.DIGITAL.SOLUTION.FOR.CAMPUS.LIFE.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {
    @Autowired
    CourseService courseService;

    @PostMapping("/save")
    public void saveCourse(@RequestBody Course course){
        courseService.addCourse(course);
    }

    @GetMapping("/list")
    public List<Course> getCourses(){
        return courseService.getAll();
    }
}
