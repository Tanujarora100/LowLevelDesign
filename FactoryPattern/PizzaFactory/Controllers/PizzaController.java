package FactoryPattern.PizzaFactory.Controllers;

import java.util.Scanner;

public class PizzaController {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws toppingException {
        System.out.println("Enter your choice of ice cream");
        System.out.println("1-Cheese Pizza, 2- Meat Pizza, 3- Veg Pizza, 4- exit");
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        if (!type.equalsIgnoreCase("Cheese pizza")) {
            System.out.println("\n Enter your choice of toppings");

        }
        String topping = scanner.nextLine();

        IPizza pizza = null;
        while (!type.equalsIgnoreCase("4")) {
            pizza = PizzaFactory.getInstance(type);
            pizza.setToppings(topping);
            pizza.prepare();

            System.out.println("\n Enter your choice of pizza again");
            type = scanner.nextLine();
            if (!type.equalsIgnoreCase("4")) {
                System.out.println("\n Enter your choice of toppings again");
                topping = scanner.nextLine();
            }
        }
        System.out.println("\nThank You ");
    }
}
