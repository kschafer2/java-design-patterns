package design.patterns.prototype.exercise.model;

public class Line
{
    public Point start, end;

    public Line(Point start, Point end)
    {
        this.start = start;
        this.end = end;
    }

    public Line deepCopy()
    {
        return new Line(this.start.deepCopy(),
                this.end.deepCopy());
    }

    @Override
    public String toString() {
        return super.toString() + "{\n" +
                "start=" + start +
                ",\nend=" + end +
                "\n}";
    }
}
