package com.example.animeweb.repo;

import com.example.animeweb.Models.MPAA;
import com.example.animeweb.Models.Source;
import org.springframework.data.repository.CrudRepository;

public interface SourceRepository extends CrudRepository<Source, Long> {
    Source findBySour(String sour);
}