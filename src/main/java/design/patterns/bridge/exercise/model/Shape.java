package design.patterns.bridge.exercise.model;

import design.patterns.bridge.exercise.bridges.Renderer;

public abstract class Shape {

    protected Renderer renderer;

    Shape(Renderer renderer) {
        this.renderer = renderer;
    }

    public abstract String getName();
}