package design.patterns.bridge.exercise;

import design.patterns.bridge.exercise.bridges.RasterRenderer;
import design.patterns.bridge.exercise.bridges.VectorRenderer;
import design.patterns.bridge.exercise.model.Square;
import design.patterns.bridge.exercise.model.Triangle;

public class SimpleBridgeDemo {
    public static void main (String[] args) {

        System.out.println(new Triangle(new RasterRenderer()).toString());
        System.out.println(new Square(new VectorRenderer()).toString());
    }
}