package com.example.animeweb.repo;

import com.example.animeweb.Models.Anime;
import org.springframework.data.repository.CrudRepository;

public interface animeRepo extends CrudRepository<Anime, Long> {
    Anime findById(long id);
}
