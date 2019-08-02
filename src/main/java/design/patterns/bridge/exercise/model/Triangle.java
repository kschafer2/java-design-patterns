package design.patterns.bridge.exercise.model;

import design.patterns.bridge.exercise.bridges.Renderer;

public class Triangle extends Shape {

    public Triangle(Renderer renderer) {
        super(renderer);
    }

    @Override
    public String getName() {
        return "Triangle";
    }

    @Override
    public String toString() {
        if(renderer.whatToRenderAs().equals("lines")) {
            return new VectorTriangle(renderer).toString();
        }
        return new RasterTriangle(renderer).toString();
    }
}
