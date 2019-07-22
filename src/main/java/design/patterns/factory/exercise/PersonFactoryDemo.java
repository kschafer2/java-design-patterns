package design.patterns.factory.exercise;

//demonstrates a factory method with fluent builder

import design.patterns.factory.exercise.factories.PeopleFactory;
import design.patterns.factory.exercise.factories.PersonFactory;
import design.patterns.factory.exercise.model.Person;

import java.util.List;

public class PersonFactoryDemo {
    public static void main(String[] args) {

        PersonFactory personFactory = new PersonFactory();
        Person chris = personFactory.createPerson("Chris");
        System.out.println(chris);

        PeopleFactory peopleFactory = new PeopleFactory();
        List<Person> people = peopleFactory
                .add(chris)
                .add("Shelly")
                .add("Abbey")
                .add("Paul")
                .build();

        System.out.println("\nPeople:");
        for(Person person : people) {
            System.out.println(person);
        }
    }
}
