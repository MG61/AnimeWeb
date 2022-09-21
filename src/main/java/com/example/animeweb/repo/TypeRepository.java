package com.example.animeweb.repo;

import com.example.animeweb.Models.Type;
import org.springframework.data.repository.CrudRepository;

public interface TypeRepository extends CrudRepository<Type, Long> {
    Type findByStreet(String street);
}
