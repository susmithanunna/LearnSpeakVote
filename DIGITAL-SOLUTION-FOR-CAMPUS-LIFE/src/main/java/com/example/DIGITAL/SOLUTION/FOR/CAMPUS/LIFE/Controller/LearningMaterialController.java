package com.example.DIGITAL.SOLUTION.FOR.CAMPUS.LIFE.Controller;

import com.example.DIGITAL.SOLUTION.FOR.CAMPUS.LIFE.Entity.LearningMaterial;
import com.example.DIGITAL.SOLUTION.FOR.CAMPUS.LIFE.Service.LearningMaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/LearningMaterial")
public class LearningMaterialController {
    @Autowired
    LearningMaterialService learningMaterialService;
    @PostMapping("/save")
    public void saveLearningMaterial(@RequestBody LearningMaterial learningMaterial) {
        learningMaterialService.uploadMaterial(learningMaterial);
    }
    @GetMapping("/getMaterial/{courseid}")
    public List<LearningMaterial> getMaterialByCourseId(@PathVariable Long courseId){
        return learningMaterialService.getMaterialsByCourse(courseId);
    }
}
