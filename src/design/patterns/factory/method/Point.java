package design.patterns.factory.method;

public class Point {

    private double x, y;

    //make constructor inaccessible to user to force use of a factory method for creation
    private Point(double x, double y) {
        this.x = x;
        this.y = y;

    }

    //factory method
    public static Point newCartesianPoint(double x, double y) {
        return new Point(x, y);
    }

    //factory method
    public static Point newPolarPoint(double rho, double theta) {
        return new Point(rho * Math.cos(theta),
                rho * Math.sin(theta));
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
