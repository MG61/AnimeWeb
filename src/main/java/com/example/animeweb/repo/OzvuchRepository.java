package com.example.animeweb.repo;

import com.example.animeweb.Models.Ozvuch;
import com.example.animeweb.Models.Quantity;
import org.springframework.data.repository.CrudRepository;

public interface OzvuchRepository extends CrudRepository<Ozvuch, Long> {
    Ozvuch findByOzv(String ozv);
}
