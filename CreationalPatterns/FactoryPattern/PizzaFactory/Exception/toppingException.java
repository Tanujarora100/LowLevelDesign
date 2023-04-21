package FactoryPattern.PizzaFactory.Exception;

public class toppingException extends Throwable {
    @Override
    public String toString() {
        return " Adding toppings for cheese pizza is not allowed.";
    }
}
