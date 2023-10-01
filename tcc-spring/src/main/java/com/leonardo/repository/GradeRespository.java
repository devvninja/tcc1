package com.leonardo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.leonardo.model.Grade;

@Repository 
public interface GradeRespository extends JpaRepository <Grade, Long> {



}
