package design.patterns.factory.exercise.factories;

import design.patterns.factory.exercise.model.Person;

import java.util.ArrayList;
import java.util.List;

public class PeopleFactory extends PersonFactory {

    List<Person> people = new ArrayList<>();

    public PeopleFactory add(String name) {
        people.add(createPerson(name));
        return this;
    }

    public PeopleFactory add(Person person) {
        people.add(person);
        return this;
    }

    public List<Person> build() {
        return people;
    }

    @Override
    public String toString() {
        return "PeopleFactory{" +
                "people=" + people +
                '}';
    }
}
