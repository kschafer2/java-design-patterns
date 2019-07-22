package design.patterns.factory.method;


//Methods in Java cannot be overloaded with the same argument types.
//Factory methods force the user to call a method that returns a new object via private constructor.

public class FactoryMethodDemo {
    public static void main(String[] args) {

        Point polarPoint = Point.newPolarPoint(2, 3);
        System.out.println(polarPoint);

        Point cartesianPoint = Point.newCartesianPoint(2, 3);
        System.out.println(cartesianPoint);
    }
}
