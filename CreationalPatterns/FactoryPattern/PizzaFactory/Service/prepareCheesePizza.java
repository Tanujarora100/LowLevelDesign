package FactoryPattern.Service;

import FactoryPattern.PizzaFactory.Exception.toppingException;

public class prepareCheesePizza implements IPizza {
    private final String ingredients;

    @Override
    public void setToppings(String toppings) throws toppingException {
        if (!toppings.isBlank()) {
            throw new toppingException();
        }
    }

    @Override
    public void prepare() {
        System.out.println("Meat Pizza is prepared with following ingredients: " + ingredients
                + "and without toppings");
    }

    // Constructor methods
    public prepareCheesePizza() {
        ingredients = "tomatos, olives, jalapeñas, onions, mushrooms";
    }
}
