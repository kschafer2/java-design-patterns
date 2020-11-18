package design.patterns.decorator;

import design.patterns.decorator.model.Dragon;

public class DecoratorDemo {

    public static void main(String[] args) {
        Dragon dragon = new Dragon();
        dragon.setAge(9);

        System.out.println(dragon.fly());
        System.out.println(dragon.crawl());
    }
}
