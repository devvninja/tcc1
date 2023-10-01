package com.leonardo.controller;

import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leonardo.repository.GradeRespository;
import com.leonardo.model.Grade;

import lombok.AllArgsConstructor;

@RestController    // Fala pro Spring que essa classe contem ENDPOINT (Url para acessar API) - Java Servless
@RequestMapping ("/api/grade")    // Qual vai ser o ENDPOINT 
@AllArgsConstructor
public class GradeController {

    private final GradeRespository gradeRespository;



    @GetMapping  // Pega dados
    public List<Grade> list () {
        return gradeRespository.findAll();
    }
    
   

}
