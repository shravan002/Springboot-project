package com.example.simple.redive.services;

import com.example.simple.redive.dao.CourseDao;
import com.example.simple.redive.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//Denotes to the spring that this class is service class for Auto wiring of its Parent class
@Service
public class CourseServiceImpl implements CourseService{

    @Autowired
    private CourseDao courseDao;

    @Override
    public List<Course> getCourses() {
        return courseDao.findAll();
    }

    @Override
    public Optional<Course> getCourse(Long id) {
        return courseDao.findById(id);
    }

    @Override
    public Course createCourse(Course course) {
        return courseDao.save(course);
    }

    @Override
    public Course updateCourse(Course course) {
        return courseDao.save(course);
    }

    @Override
    public void deleteCourse(long courseId) {
        Course course = courseDao.getOne(courseId);
        courseDao.delete(course);
    }
//    List<Course> list;

//    public CourseServiceImpl(){
////        list = new ArrayList<>();
////        list.add(new Course(576, "Physics", "This is Physics course"));
////        list.add(new Course(789, "Chemistry", "This is Chemistry course"));
//    }
//
//    @Override
//    public List<Course> getCourses() {
//        return list;
//    }
//
//    @Override
//    public Course getCourse(Long id) {
//        Course c = null;
//        for(Course course: list){
//            if(course.getId() == id) {
//                c = course;
//                break;
//            }
//        }
//        return c;
//    }
//
//    @Override
//    public Course createCourse(Course course) {
//        list.add(course);
//        return course;
//    }
//
//    @Override
//    public Course updateCourse(Course course) {
//        Course c = null;
//        for(Course course1 : list){
//            if(course1.getId() == course.getId()){
//                list.remove(course1);
//                c = new Course(course.getId(), course.getTitle(), course.getDescription());
//                list.add(c);
//                break;
//            }
//        }
//        return c;
//    }
//
//    @Override
//    public Course deleteCourse(long courseId) {
//        Course c = null;
//        for(Course course1 : list){
//            if(course1.getId() == courseId){
//                list.remove(course1);
//                c = course1;
//                break;
//            }
//        }
//        return c;
//    }
}
