package FactoryPattern.Service;

import FactoryPattern.PizzaFactory.Exception.toppingException;

public interface IPizza {
    void setToppings(String toppings) throws toppingException;

    void prepare();
}
