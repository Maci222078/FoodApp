package org.example.vebprogramiranje2025.repository.impl;

import org.example.vebprogramiranje2025.bootstrap.DataHolder;
import org.example.vebprogramiranje2025.model.Chef;
import org.example.vebprogramiranje2025.repository.ChefRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class InMemoryChefRepository implements ChefRepository {

    @Override
    public List<Chef> findAll() {
        return DataHolder.chefs;
    }

    @Override
    public Optional<Chef> findById(Long id) {
        return DataHolder.chefs.stream().filter(chef -> chef.getId().equals(id)).findFirst();
    }

    @Override
    public Chef save(Chef chef) {
        if(DataHolder.chefs.contains(chef)) {
            int index = DataHolder.chefs.indexOf(chef);
            DataHolder.chefs.set(index, chef);
        }
        else {
            DataHolder.chefs.add(chef);
        }
        return chef;
    }
}
