package design.patterns.prototype.copyconstructor;

import design.patterns.prototype.copyconstructor.model.Address;
import design.patterns.prototype.copyconstructor.model.Employee;

//demonstrates deep copying through copy constructors

//inefficient with many involved classes

public class CopyConstructorDemo {
    public static void main(String[] args) {

        Employee dave = new Employee("Dave",
                        new Address("123 Main",
                                    "Kansas City",
                                    "USA"));

        Employee dave2 = new Employee(dave);

        System.out.println(dave);
        System.out.println(dave2);
    }
}
