package design.patterns.factory.exercise.factories;

import design.patterns.factory.exercise.model.Person;

public class PersonFactory
{
    private static int personCounter = -1;

    public Person createPerson(String name)
    {
        ++personCounter;
        return new Person(personCounter, name);
    }
}
