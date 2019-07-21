package design.patterns.builder.inheritance;

import design.patterns.builder.inheritance.builders.EmployeeBuilder;

public class InheritanceBuilderDemo {
    public static void main(String[] args) {

        EmployeeBuilder personBuilder = new EmployeeBuilder();

        //kyle is a person
        var kyle = personBuilder.name("Kyle").build();
        System.out.println(kyle);

        //kyle becomes an employee
        kyle = personBuilder.name("Kyle").position("Developer").build();
        System.out.println(kyle);
    }
}
