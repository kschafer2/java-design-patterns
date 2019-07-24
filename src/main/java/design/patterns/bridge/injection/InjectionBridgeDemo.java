package design.patterns.bridge.injection;

import com.google.inject.Guice;
import com.google.inject.Injector;
import design.patterns.bridge.injection.model.Circle;
import design.patterns.bridge.injection.modules.ShapeVectorModule;

// used to limit instantiated objects to the user's needs
// when there are many combinations of possible objects

public class InjectionBridgeDemo {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new ShapeVectorModule());

        //uncomment to use RasterRenderer instead of VectorRenderer
        //injector = Guice.createInjector(new ShapeRasterModule());

        Circle instance = injector.getInstance(Circle.class);

        instance.setRadius(3);
        instance.draw();

        instance.resize(2);
        instance.draw();
    }
}
