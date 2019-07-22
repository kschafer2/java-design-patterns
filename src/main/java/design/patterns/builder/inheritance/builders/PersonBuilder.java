package design.patterns.builder.inheritance.builders;

import design.patterns.builder.inheritance.model.Person;

public class PersonBuilder<SELF extends PersonBuilder<SELF>> {

    protected Person person = new Person();

    public SELF name(String name) {
        person.setName(name);

        return self();
    }

    public Person build() {
        return person;
    }

    protected SELF self() {
        return (SELF) this;
    }
}
