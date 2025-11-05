package org.example.vebprogramiranje2025.bootstrap;

import jakarta.annotation.PostConstruct;
import org.example.vebprogramiranje2025.model.Chef;
import org.example.vebprogramiranje2025.model.Dish;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataHolder {

    public static List<Chef> chefs = new ArrayList<>();
    public static List<Dish> dishes = new ArrayList<>();

    @PostConstruct
    public void init() {
        chefs.add(new Chef(1L, "Martin", "Patovski", "A good chef", new ArrayList<>()));
        chefs.add(new Chef(5L, "Anna", "Ristic", "A pastry expert known for her creative desserts.", new ArrayList<>()));
        chefs.add(new Chef(6L, "David", "Peterson", "A grill master who specializes in American BBQ.", new ArrayList<>()));
        chefs.add(new Chef(7L, "Elena", "Popova", "A vegan chef focused on healthy and sustainable cooking.", new ArrayList<>()));
        chefs.add(new Chef(8L, "Luca", "Bianchi", "An Italian chef famous for his handmade pasta and rustic flavors.", new ArrayList<>()));

        dishes.add(new Dish("no.1","Ajvar", "Macedonian",5));
        dishes.add(new Dish("no.2", "Sarma", "Macedonian", 20));
        dishes.add(new Dish("no.3", "Shopska Salad", "Balkan", 10));
        dishes.add(new Dish("no.4", "Moussaka", "Balkan", 35));
        dishes.add(new Dish("no.5", "Tavche Gravche", "Macedonian", 25));
    }



}
