package com.example.animeweb.repo;

import com.example.animeweb.Models.Quantity;
import com.example.animeweb.Models.Status;
import org.springframework.data.repository.CrudRepository;

public interface StatusRepository extends CrudRepository<Status, Long> {
    Status findByStat(String stat);
}