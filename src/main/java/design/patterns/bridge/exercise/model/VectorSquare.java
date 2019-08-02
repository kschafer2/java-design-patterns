package design.patterns.bridge.exercise.model;

import design.patterns.bridge.exercise.bridges.Renderer;

public class VectorSquare extends Square {

    protected VectorSquare(Renderer renderer) {
        super(renderer);
    }

    @Override
    public String toString() {
        return String.format("Drawing %s as lines", getName());
    }
}
