package com.example.DIGITAL.SOLUTION.FOR.CAMPUS.LIFE.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.DIGITAL.SOLUTION.FOR.CAMPUS.LIFE.Entity.User;
@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
