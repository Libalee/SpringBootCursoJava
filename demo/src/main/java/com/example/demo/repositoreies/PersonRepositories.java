package com.example.demo.repositoreies;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Person;

@Repository
public interface PersonRepositories extends JpaRepository<Person, Long>{
    
}
