package com.leiber.pizza.errors;

import com.leiber.pizza.persistence.entity.Pizza;

public class PizzaAlreadyExistsException extends RuntimeException{
    public PizzaAlreadyExistsException(Pizza pizza) {
        super("Ya existe la pizza con id: " + pizza.getIdPizza());
    }
}
