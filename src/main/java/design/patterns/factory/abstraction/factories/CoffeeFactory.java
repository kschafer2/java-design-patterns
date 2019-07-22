package design.patterns.factory.abstraction.factories;

import design.patterns.factory.abstraction.model.Coffee;
import design.patterns.factory.abstraction.model.HotDrink;

public class CoffeeFactory implements HotDrinkFactory {

    @Override
    public HotDrink prepare(int amount) {
        System.out.println(
                "Grind coffee beans, boil water, pour "
                        + amount + "ml, enjoy!"
        );
        return new Coffee();
    }
}
