package com.example.DIGITAL.SOLUTION.FOR.CAMPUS.LIFE.Repository;

import com.example.DIGITAL.SOLUTION.FOR.CAMPUS.LIFE.Entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event,Long> {
}
