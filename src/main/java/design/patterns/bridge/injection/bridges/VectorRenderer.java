package design.patterns.bridge.injection.bridges;

public class VectorRenderer implements Renderer {

    @Override
    public void renderCircle(float radius) {
        System.out.println("Drawing a circle of radius "
                + radius);
    }
}
