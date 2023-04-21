package FactoryPattern.Service;

import FactoryPattern.PizzaFactory.Exception.toppingException;

public class prepareVegPizza implements IPizza {
    private final String ingredients;
    private String toppings;

    @Override
    public void setToppings(String toppings) throws toppingException {
        this.toppings = toppings;
    }

    @Override
    public void prepare() {
        System.out.println("Veg Pizza is prepared with following ingredients: " + ingredients
                + (this.toppings != null && !this.toppings.isEmpty() ? (" and with toppings " + this.toppings)
                        : " and without toppings"));
    }

    // Constructor methods
    public prepareVegPizza() {
        ingredients = "tomatos, olives, jalapeñas, onions, mushrooms";
    }

}
