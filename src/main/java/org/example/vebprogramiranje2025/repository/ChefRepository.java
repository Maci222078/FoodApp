package org.example.vebprogramiranje2025.repository;

import org.example.vebprogramiranje2025.model.Chef;

import java.util.List;
import java.util.Optional;

public interface ChefRepository {
        List<Chef> findAll();
        Optional<Chef> findById(Long id);
        Chef save(Chef chef);
    }

