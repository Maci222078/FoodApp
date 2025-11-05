package org.example.vebprogramiranje2025.service.impl;

import org.example.vebprogramiranje2025.model.Dish;
import org.example.vebprogramiranje2025.repository.DishRepository;
import org.example.vebprogramiranje2025.service.DishService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DishServiceImpl implements DishService {
    private final DishRepository dishRepository;

    public DishServiceImpl(DishRepository dishRepository) {
        this.dishRepository = dishRepository;
    }


    @Override
    public List<Dish> listDishes() {
        return dishRepository.findAll();
    }

    @Override
    public Dish findByDishId(String dishId) {
        return dishRepository.findByDishId(dishId);
    }
}
