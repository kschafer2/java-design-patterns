package design.patterns.builder.faceted;

import design.patterns.builder.faceted.builders.PersonBuilder;
import design.patterns.builder.faceted.model.Person;

public class FacetedBuilderDemo {
    public static void main(String[] args) {

        PersonBuilder personBuilder = new PersonBuilder();
        Person person = personBuilder
                .lives()
                    .streetAddress("123 London Road")
                    .city("London")
                    .postCode("12345")
                .works()
                    .companyName("Software Company")
                    .position("Engineer")
                    .annualIncome(70000)
                .build();

        System.out.println(person);

    }
}
