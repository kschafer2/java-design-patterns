package design.patterns.factory.abstraction.model;

public class Coffee implements HotDrink {

    @Override
    public void consume() {
        System.out.println("This coffee is delicious!");
    }
}
