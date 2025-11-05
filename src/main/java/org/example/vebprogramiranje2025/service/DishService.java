package org.example.vebprogramiranje2025.service;

import org.example.vebprogramiranje2025.model.Dish;

import java.util.List;

public interface DishService {
    List<Dish> listDishes();
    Dish findByDishId(String dishId);
}
