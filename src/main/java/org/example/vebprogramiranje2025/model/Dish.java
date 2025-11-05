package org.example.vebprogramiranje2025.model;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import lombok.AllArgsConstructor;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Dish {
    String dishId;
    String name;
    String cuisine;
    int preparationTime;
}
