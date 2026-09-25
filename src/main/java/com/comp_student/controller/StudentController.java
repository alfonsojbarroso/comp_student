package com.comp_student.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.comp_student.dto.StudentDto;
import com.comp_student.service.StudentService;

import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/student")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public Flux<StudentDto> getStudentFlux() {
        return studentService.getStudent();
    }

}
