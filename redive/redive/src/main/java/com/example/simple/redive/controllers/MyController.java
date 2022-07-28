package com.example.simple.redive.controllers;

import com.example.simple.redive.entities.Course;
import com.example.simple.redive.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MyController {

    //Spring will create object of impl class CourseService and inject in the variable CourseService
    @Autowired
    CourseService courseService;

    @GetMapping("/home")
    public String home(){
        return "This is home page";
    }

    @GetMapping("/courses")
    public List<Course> getCourse(){
        return courseService.getCourses();
    }

    @GetMapping("/course/{courseId}")
    public Course getCourse(@PathVariable String courseId){
        Optional<Course> course = courseService.getCourse(Long.parseLong(courseId));
        return course.get();
    }

    @PostMapping("/course")
    public Course createCourse(@RequestBody Course course){
        return courseService.createCourse(course);
    }

    @PutMapping("/course")
    public Course updateCourse(@RequestBody Course course){
        return courseService.updateCourse(course);
    }

    @DeleteMapping("/course/{courseId}")
    public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId){
        try{
            courseService.deleteCourse(Long.parseLong(courseId));
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
