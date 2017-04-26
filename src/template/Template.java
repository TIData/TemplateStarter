package template;

import domein.CaffeineBeverage;
import domein.Coffee;
import domein.CoffeeWithHook;
import domein.Tea;
import java.util.Scanner;

public class Template {

    public static void main(String[] args) {
        System.out.println("Making coffee");
        new Coffee().prepareRecipe();
        System.out.println();
        System.out.println("Making tea");
        new Tea().prepareRecipe();
        
        System.out.println("Making  coffee");
        CaffeineBeverage beverage = new Coffee();
        beverage.prepareRecipe();
        System.out.println("Making  tea");
        beverage = new Tea();
        beverage.prepareRecipe();
        System.out.println("Making coffee with a hook");
        boolean answer = getUserInputForCoffee();
        beverage = new CoffeeWithHook(answer);
        beverage.prepareRecipe();
    }
    public static boolean getUserInputForCoffee() {
        String answer = null;
        System.out.println("Would you like milk and sugar with your coffee (y/n)?");
        Scanner in = new Scanner(System.in);
        return in.next().equalsIgnoreCase("y");
    }
}
