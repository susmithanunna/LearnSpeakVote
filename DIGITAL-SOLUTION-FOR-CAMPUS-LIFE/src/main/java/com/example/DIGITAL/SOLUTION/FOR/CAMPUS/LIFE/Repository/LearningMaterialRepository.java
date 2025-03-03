package com.example.DIGITAL.SOLUTION.FOR.CAMPUS.LIFE.Repository;

import com.example.DIGITAL.SOLUTION.FOR.CAMPUS.LIFE.Entity.LearningMaterial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LearningMaterialRepository extends JpaRepository<LearningMaterial,Long> {
    List<LearningMaterial> findByCourseId(Long courseId);
}
