package com.example.animeweb.repo;

import com.example.animeweb.Models.MPAA;
import com.example.animeweb.Models.Ozvuch;
import org.springframework.data.repository.CrudRepository;

public interface MPAARepository extends CrudRepository<MPAA, Long> {
    MPAA findByMpaa(String mpaa);
}