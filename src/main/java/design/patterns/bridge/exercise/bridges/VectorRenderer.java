package design.patterns.bridge.exercise.bridges;

public class VectorRenderer implements Renderer {

    @Override
    public String whatToRenderAs() {
        return "lines";
    }
}