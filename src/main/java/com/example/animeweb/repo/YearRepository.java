package com.example.animeweb.repo;

import com.example.animeweb.Models.Ozvuch;
import com.example.animeweb.Models.Year;
import org.springframework.data.repository.CrudRepository;

public interface YearRepository extends CrudRepository<Year, Long> {
    Year findByYea(String yea);
}
