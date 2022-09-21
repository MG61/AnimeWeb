package com.example.animeweb.repo;

import com.example.animeweb.Models.Genre;

import org.springframework.data.repository.CrudRepository;

public interface GenreRepository extends CrudRepository<Genre, Long> {
    Genre findByGenr(String genr);
}