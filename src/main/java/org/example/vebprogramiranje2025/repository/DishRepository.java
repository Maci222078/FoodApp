package org.example.vebprogramiranje2025.repository;

import org.example.vebprogramiranje2025.model.Dish;

import java.util.List;

public interface DishRepository {
    List<Dish> findAll();
    Dish findByDishId(String dishId);
}
