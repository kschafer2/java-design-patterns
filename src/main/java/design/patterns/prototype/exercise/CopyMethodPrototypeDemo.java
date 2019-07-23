package design.patterns.prototype.exercise;

//demonstrates copy methods for deep copying

//inefficient with many involved classes

import design.patterns.prototype.exercise.model.Line;
import design.patterns.prototype.exercise.model.Point;

public class CopyMethodPrototypeDemo {
    public static void main(String[] args) {

        Line line = new Line(new Point(1,5), new Point(10, 6));
        Line line2 = line.deepCopy();

        System.out.println(line);
        System.out.println(line2);

    }
}
