package org.example.vebprogramiranje2025.repository.impl;

import org.example.vebprogramiranje2025.bootstrap.DataHolder;
import org.example.vebprogramiranje2025.model.Dish;
import org.example.vebprogramiranje2025.repository.DishRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class InMemoryDishRepository implements DishRepository {
    @Override
    public List<Dish> findAll() {
        return DataHolder.dishes;
    }

    @Override
    public Dish findByDishId(String dishId) {
        return DataHolder.dishes.stream().filter(dish -> dish.getDishId().equals(dishId)).findFirst().orElse(null);
    }
}
