package com.example.animeweb.repo;

import com.example.animeweb.Models.Anime;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface animeRepo extends CrudRepository<Anime, Long> {
    Anime findById(long id);
    List<Anime> findByNameContains(String name);
    List<Anime> findByName(String name);
    Anime deleteById(long id);
}
