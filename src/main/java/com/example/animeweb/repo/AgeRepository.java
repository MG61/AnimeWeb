package com.example.animeweb.repo;

import com.example.animeweb.Models.Age;
import org.springframework.data.repository.CrudRepository;

public interface AgeRepository extends CrudRepository<Age, Long> {
    Age findByAg(String ag);
}