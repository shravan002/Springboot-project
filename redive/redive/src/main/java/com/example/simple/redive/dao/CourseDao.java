package com.example.simple.redive.dao;

import com.example.simple.redive.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDao extends JpaRepository<Course, Long> {
}
