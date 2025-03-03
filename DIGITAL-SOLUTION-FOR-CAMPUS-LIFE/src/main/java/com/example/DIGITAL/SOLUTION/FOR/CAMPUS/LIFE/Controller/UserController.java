package com.example.DIGITAL.SOLUTION.FOR.CAMPUS.LIFE.Controller;

import com.example.DIGITAL.SOLUTION.FOR.CAMPUS.LIFE.Entity.Assignments;
import com.example.DIGITAL.SOLUTION.FOR.CAMPUS.LIFE.Entity.Course;
import com.example.DIGITAL.SOLUTION.FOR.CAMPUS.LIFE.Entity.User;
import com.example.DIGITAL.SOLUTION.FOR.CAMPUS.LIFE.Service.AssignmentService;
import com.example.DIGITAL.SOLUTION.FOR.CAMPUS.LIFE.Service.CourseService;
import com.example.DIGITAL.SOLUTION.FOR.CAMPUS.LIFE.Service.EventService;
import com.example.DIGITAL.SOLUTION.FOR.CAMPUS.LIFE.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/User")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private CourseService courseService;

    @Autowired
    private EventService eventService;

    @Autowired
    private AssignmentService assignmentService;

    @PostMapping("/saveUser")
    public void saveUser(@RequestBody User user) {
        userService.saveUser(user);
    }

    @GetMapping("/listOfUser")
    public List<User> getUsers(){
        return userService.getAll();
    }
    @GetMapping("/getUserById/{id}")
    public User getUserById(@PathVariable Long id){
        return userService.getUserById(id);
    }
    @GetMapping("/getCourses/{id}")
    public Set<String> getCousresById(@PathVariable Long id){
        User user=userService.getUserById(id);
        return userService.getCoursesNames(user.getCourses());
    }

    @PostMapping("/enroll/{userId}/{courseId}")
    public void  enrollToCourse(@PathVariable Long userId, @PathVariable Long courseId, Model model) {
            User user = userService.getUserById(userId);
            Course course = courseService.getCourseById(courseId);
            userService.enrollToCourse(user, course);

    }
    @PostMapping("/uploadAssignments")
    public void uploadAssignment(@RequestBody Assignments assignments) {
         assignmentService.save(assignments);
    }
    @GetMapping("/getAssignmentsById/{studentId}/{courseId}")
    public List<Assignments> getAssignment(@PathVariable Long studentId,@PathVariable Long courseId){
        return assignmentService.getAssignment(studentId,courseId);
    }

}
