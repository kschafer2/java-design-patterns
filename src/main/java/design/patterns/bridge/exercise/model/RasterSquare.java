package design.patterns.bridge.exercise.model;

import design.patterns.bridge.exercise.bridges.Renderer;

public class RasterSquare extends Square {

    protected RasterSquare(Renderer renderer) {
        super(renderer);
    }

    @Override
    public String toString() {
        return String.format("Drawing %s as pixels", getName());
    }
}