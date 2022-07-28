package com.example.simple.redive.services;

import com.example.simple.redive.entities.Course;

import java.util.List;
import java.util.Optional;

public interface CourseService {
    public List<Course> getCourses();
    public Optional<Course> getCourse(Long id);

    Course createCourse(Course course);

    Course updateCourse(Course course);

    void deleteCourse(long courseId);
}
