package org.example.vebprogramiranje2025.service.impl;

import org.example.vebprogramiranje2025.model.Chef;
import org.example.vebprogramiranje2025.model.Dish;
import org.example.vebprogramiranje2025.repository.ChefRepository;
import org.example.vebprogramiranje2025.repository.DishRepository;
import org.example.vebprogramiranje2025.service.ChefService;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class ChefServiceImpl implements ChefService {

    private final ChefRepository chefRepository;
    private final DishRepository dishRepository;

    public ChefServiceImpl(ChefRepository chefRepository, DishRepository dishRepository) {
        this.chefRepository = chefRepository;
        this.dishRepository = dishRepository;
    }

    @Override
    public List<Chef> listChefs() {
        return chefRepository.findAll();
    }

    @Override
    public Chef findById(Long id) {
        return chefRepository.findById(id).isPresent() ? chefRepository.findById(id).get() : null;
    }

    @Override
    public Chef addDishToChef(Long chefId, String dishId) {
        Chef chef = findById(chefId);
        List<Dish> dishes = chef.getDishes();
        Dish targetDish = dishRepository.findByDishId(dishId);
        if(targetDish != null && !dishes.contains(targetDish)) {
            dishes.add(targetDish);
            chef.setDishes(dishes);
        }
        return chefRepository.save(chef);
    }
}
