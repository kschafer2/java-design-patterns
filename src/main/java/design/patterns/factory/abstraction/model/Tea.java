package design.patterns.factory.abstraction.model;

public class Tea implements HotDrink {

    @Override
    public void consume() {
        System.out.println("This tea is delicious!");
    }
}
