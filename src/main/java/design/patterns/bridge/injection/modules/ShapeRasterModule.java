package design.patterns.bridge.injection.modules;

import com.google.inject.AbstractModule;
import design.patterns.bridge.injection.bridges.RasterRenderer;
import design.patterns.bridge.injection.bridges.Renderer;

public class ShapeRasterModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(Renderer.class).to(RasterRenderer.class);
    }
}
