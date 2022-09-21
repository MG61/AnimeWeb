package com.example.animeweb.repo;

import com.example.animeweb.Models.Quantity;
import com.example.animeweb.Models.Type;
import org.springframework.data.repository.CrudRepository;

public interface QuantityRepository extends CrudRepository<Quantity, Long> {
    Quantity findByCol(String col);
}