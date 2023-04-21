package FactoryPattern.PizzaFactory.Factory;

import FactoryPattern.Service.IPizza;
import FactoryPattern.Service.prepareCheesePizza;
import FactoryPattern.Service.prepareMeatPizza;
import FactoryPattern.Service.prepareVegPizza;

public class PizzaFactory {
    public static IPizza getInstance(String type) {

        switch (type) {

            case "1":
                return new prepareCheesePizza();
            case "2":
                return new prepareMeatPizza();
            case "3":
                return new prepareVegPizza();

        }
        return null;
    }
}
