package design.patterns.bridge.exercise.bridges;

public class RasterRenderer implements Renderer {

    @Override
    public String whatToRenderAs() {
        return "pixels";
    }
}