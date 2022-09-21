package com.example.animeweb.repo;

import com.example.animeweb.Models.Ozvuch;
import com.example.animeweb.Models.Studio;
import org.springframework.data.repository.CrudRepository;

public interface StudioRepository extends CrudRepository<Studio, Long> {
    Studio findByStud(String stud);
}