package org.example.vebprogramiranje2025.service;

import org.example.vebprogramiranje2025.model.Chef;

import java.util.List;

public interface ChefService {
    List<Chef> listChefs();
    Chef findById(Long id);
    Chef addDishToChef(Long chefId, String dishId);
}
