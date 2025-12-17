package com.example.demo.repository;

import org.springframework.data.jpa.JpaRepository;

import com.example.demo.entity.Stuentity;

@Repository 
public interface StudentRepository extends JpaRepository<Stuentity,Long>{

}