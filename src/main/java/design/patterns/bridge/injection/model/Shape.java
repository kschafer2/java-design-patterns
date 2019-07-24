package design.patterns.bridge.injection.model;

import design.patterns.bridge.injection.bridges.Renderer;

public abstract class Shape {

    protected Renderer renderer;

    public Shape(Renderer renderer) {
        this.renderer = renderer;
    }

    public abstract void draw();
    public abstract void resize(float factor);
}


