package design.patterns.bridge.injection.modules;

import com.google.inject.AbstractModule;
import design.patterns.bridge.injection.bridges.Renderer;
import design.patterns.bridge.injection.bridges.VectorRenderer;

public class ShapeVectorModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(Renderer.class).to(VectorRenderer.class);
    }
}
