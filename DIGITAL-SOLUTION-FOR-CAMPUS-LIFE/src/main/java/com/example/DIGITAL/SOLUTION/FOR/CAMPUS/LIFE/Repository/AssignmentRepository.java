package com.example.DIGITAL.SOLUTION.FOR.CAMPUS.LIFE.Repository;

import com.example.DIGITAL.SOLUTION.FOR.CAMPUS.LIFE.Entity.Assignments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AssignmentRepository extends JpaRepository<Assignments,Long> {

    @Query("select  S from Assignments  S where S.studentId=:studentId and S.courseId=:courseId")
    public List<Assignments> getAssignment(@Param("studentId")Long studentId, @Param("courseId") Long courseId);

//
//    @Query("SELECT S FROM Assignments S WHERE S.studentId = :studentId AND S.courseId = :courseId")
//    Assignments getAssignment(@Param("studentId") Long studentId, @Param("courseId") Long courseId);

}
