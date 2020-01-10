package com.spring.recipeapp.repositories;

import com.spring.recipeapp.model.UnitofMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitofMeasure, Long> {

    Optional<UnitofMeasure> findByDescription(String description);
}
