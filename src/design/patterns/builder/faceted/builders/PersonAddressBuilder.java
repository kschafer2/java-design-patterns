package design.patterns.builder.faceted.builders;

import design.patterns.builder.faceted.model.Person;

public class PersonAddressBuilder extends PersonBuilder {

    public PersonAddressBuilder(Person person) {
        this.person = person;
    }

    public PersonAddressBuilder streetAddress(String streetAddress) {
        person.setStreetAddress(streetAddress);
        return this;
    }

    public PersonAddressBuilder postCode(String postCode) {
        person.setPostcode(postCode);
        return this;
    }

    public PersonAddressBuilder city(String city) {
        person.setCity(city);
        return this;
    }


}
