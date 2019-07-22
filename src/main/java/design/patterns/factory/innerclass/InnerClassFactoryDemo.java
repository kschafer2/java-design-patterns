package design.patterns.factory.innerclass;


//Methods in Java cannot be overloaded with the same argument types.

//An inner Factory static class forces the user to call a method that
//returns a new object via private constructor and allows for grouping.

public class InnerClassFactoryDemo {
    public static void main(String[] args) {

        Point polarPoint = Point.Factory.newPolarPoint(2, 3);
        System.out.println(polarPoint);

        Point cartesianPoint = Point.Factory.newCartesianPoint(2, 3);
        System.out.println(cartesianPoint);
    }
}
