package com.example.DIGITAL.SOLUTION.FOR.CAMPUS.LIFE.Service;

import com.example.DIGITAL.SOLUTION.FOR.CAMPUS.LIFE.Entity.Course;
import com.example.DIGITAL.SOLUTION.FOR.CAMPUS.LIFE.Entity.Role;
import com.example.DIGITAL.SOLUTION.FOR.CAMPUS.LIFE.Entity.User;
import com.example.DIGITAL.SOLUTION.FOR.CAMPUS.LIFE.Repository.CourseRepository;
import com.example.DIGITAL.SOLUTION.FOR.CAMPUS.LIFE.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private CourseRepository courseRepository;
    public void saveUser(User user){
        //ser u1=new User("susmitha","2525", Role.STUDENT);
        userRepository.save(user);
    }
    public List<User> getAll(){
        return userRepository.findAll();
    }
    public List<Pair> getNameId(List<User> users){
        List<Pair> nameId=new ArrayList<>();
        for(User u:users){
            nameId.add(new Pair(u.getId(),u.getUsername()));
        }
        return nameId;
    }
    public User getUserById(Long id){
        return userRepository.getById(id);
    }

    public void enrollToCourse(User user, Course course){
        user.getCourses().add(course);
        // Save updated user to the database
        userRepository.save(user);
        courseRepository.save(course);
    }
    public Set<String> getCoursesNames(Set<Course> courses){
        Set<String> c=new HashSet<>();
        for(Course c1:courses){
            c.add(c1.getName());
        }
        return c;
    }
}
class Pair{
    Long id;
    String name;
    public Pair(Long id,String name){
        this.id=id;
        this.name=name;
    }
}
