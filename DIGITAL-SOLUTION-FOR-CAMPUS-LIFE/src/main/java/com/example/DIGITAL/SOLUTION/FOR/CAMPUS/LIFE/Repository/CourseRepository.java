package com.example.DIGITAL.SOLUTION.FOR.CAMPUS.LIFE.Repository;

import com.example.DIGITAL.SOLUTION.FOR.CAMPUS.LIFE.Entity.Course;
import org.hibernate.Remove;
import org.hibernate.sql.ast.tree.expression.JdbcParameter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course,Long> {
}
