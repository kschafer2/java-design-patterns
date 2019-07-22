package design.patterns.factory.abstraction.factories;

import design.patterns.factory.abstraction.model.HotDrink;
import design.patterns.factory.abstraction.model.Tea;

public class TeaFactory implements HotDrinkFactory {

    @Override
    public HotDrink prepare(int amount) {
        System.out.println(
                "Put in tea bag, boil water, pour "
                + amount + "ml, add lemon, enjoy!"
        );
        return new Tea();
    }
}
