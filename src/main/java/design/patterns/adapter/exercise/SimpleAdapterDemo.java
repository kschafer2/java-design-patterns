package design.patterns.adapter.exercise;

import design.patterns.adapter.exercise.model.Square;

//uses a simple adapter to use the Rectangle interface with a Square

public class SimpleAdapterDemo {
    public static void main(String[] args) {

        SquareToRectangleAdapter adapter =
                new SquareToRectangleAdapter(new Square(10));

        System.out.println("Height: " + adapter.getHeight());
        System.out.println("Width: " + adapter.getWidth());
        System.out.println("Area: " + adapter.getArea());
    }
}
