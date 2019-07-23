package design.patterns.adapter.exercise;

import design.patterns.adapter.exercise.model.Rectangle;
import design.patterns.adapter.exercise.model.Square;

public class SquareToRectangleAdapter implements Rectangle {

    private int side;

    public SquareToRectangleAdapter(Square square)
    {
        this.side = square.side;
    }

    public int getWidth() {
        return side;
    }

    public int getHeight() {
        return side;
    }
}
