package design.patterns.composite.manyasone;

//drawing, a compound object, is treated as the same way a single object is treated

import design.patterns.composite.manyasone.model.Circle;
import design.patterns.composite.manyasone.model.GraphicObject;
import design.patterns.composite.manyasone.model.Square;

public class ManyAsOneCompositeDemo {
    public static void main(String[] args) {
        GraphicObject drawing = new GraphicObject();
        drawing.setName("My Drawing");
        drawing.children.add(new Square("Red"));
        drawing.children.add(new Circle("Yellow"));

        GraphicObject group = new GraphicObject();
        group.children.add(new Circle("Blue"));
        group.children.add(new Square("Blue"));
        drawing.children.add(group);

        System.out.println(drawing);
    }
}
