package design.patterns.factory.abstraction.factories;

import design.patterns.factory.abstraction.model.HotDrink;

public interface HotDrinkFactory {

    HotDrink prepare(int amount);
}
