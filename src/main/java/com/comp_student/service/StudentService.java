package com.comp_student.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.comp_student.dto.StudentDto;

import reactor.core.publisher.Flux;

@Service 
public class StudentService {

    private final WebClient webClient;

    public StudentService(WebClient webClient) {
        this.webClient = webClient;
    }

    public Flux<StudentDto> getStudent() {
        return webClient
                .get()
                .uri("http://localhost:8080/student")
                .retrieve()
                .bodyToFlux(StudentDto.class);
    }

}
