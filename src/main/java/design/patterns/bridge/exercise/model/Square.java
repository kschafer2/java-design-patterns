package design.patterns.bridge.exercise.model;

import design.patterns.bridge.exercise.bridges.Renderer;

public class Square extends Shape {

    public Square(Renderer renderer) {
        super(renderer);
    }

    @Override
    public String getName() {
        return "Square";
    }

    @Override
    public String toString() {
        if(renderer.whatToRenderAs().equals("lines")) {
            return new VectorSquare(renderer).toString();
        }
        return new RasterSquare(renderer).toString();
    }
}