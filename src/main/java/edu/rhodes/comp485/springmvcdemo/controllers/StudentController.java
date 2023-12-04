package edu.rhodes.comp485.springmvcdemo.controllers;

import edu.rhodes.comp485.springmvcdemo.model.entities.Student;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @GetMapping("/students")
    public List<Student> getAllStudents() {
        Student student1 = new Student(1L, "R05552143", "Kellar Carson", "carkb-24@rhodes.edu");
        Student student2 = new Student(2L, "R05552144", "Billy Mathers", "matbl-25@rhodes.edu");
        return List.of(student1, student2);
    }

    @GetMapping("/students/{id}")
    public Student getStudent(@PathVariable long id) {
        return new Student(id, "johndoe", "John Doe", "johnd@rhodes.edu");
    }

    @PostMapping("/students")
    public void addStudents(@RequestBody List<Student> students) {
        for (Student student: students) {
            System.out.println(student);
        }
    }

    @PutMapping("/students/{id}")
    public void updateStudents(@PathVariable Long id, @RequestBody Student student) {
        System.out.println("Updating student " + id + " to " + student);
    }

    @DeleteMapping("/students/{id}")
    public void deleteStudent(@PathVariable Long id) {
        System.out.println("Deleting student with id " + id);
    }
}
