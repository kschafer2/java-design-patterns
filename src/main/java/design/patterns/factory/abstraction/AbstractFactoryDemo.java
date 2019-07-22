package design.patterns.factory.abstraction;

import design.patterns.factory.abstraction.model.HotDrink;
import design.patterns.factory.abstraction.model.HotDrinkMachine;

public class AbstractFactoryDemo {
    public static void main(String[] args) throws Exception {

        HotDrinkMachine hotDrinkMachine = new HotDrinkMachine();

        HotDrink drink = hotDrinkMachine.makeDrink();
        drink.consume();

    }
}

