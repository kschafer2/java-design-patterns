package design.patterns.adapter.caching;

import design.patterns.adapter.caching.model.Line;
import design.patterns.adapter.caching.model.Point;
import design.patterns.adapter.caching.model.VectorObject;
import design.patterns.adapter.caching.model.VectorRectangle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// used when the interface you have is not the interface you need

// In this example, caching is used to prevent generating the same
// lines multiple times with successive calls to the draw method.

public class AdapterCachingDemo {

    public AdapterCachingDemo() {
    }

    private final static List<VectorObject> vectorObjects =
            new ArrayList<>(Arrays.asList(
                    new VectorRectangle(1,1,10,10),
                    new VectorRectangle(3, 3, 6, 6)
            ));

    public static void drawPoint(Point point) {
        System.out.println(".");
    }

    private static void draw() {
        for(VectorObject object : vectorObjects) {
            for(Line line : object) {
                LineToPointAdapter adapter = new LineToPointAdapter(line);
                adapter.forEach(AdapterCachingDemo::drawPoint);
            }
        }
    }

    public static void main(String[] args) {

        draw();
        draw();

    }
}
