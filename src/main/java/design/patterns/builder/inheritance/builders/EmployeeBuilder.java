package design.patterns.builder.inheritance.builders;

import design.patterns.builder.inheritance.model.Employee;
import design.patterns.builder.inheritance.model.Person;

public class EmployeeBuilder extends PersonBuilder<EmployeeBuilder> {

    protected Employee employee = new Employee();

    public EmployeeBuilder position(String position) {
        employee.setPosition(position);

        return self();
    }

    @Override
    public Person build() {
        employee.setName(person.getName());

        if(employee.getPosition() == null) {
            return person;
        }
        return employee;
    }

    @Override
    protected EmployeeBuilder self() {
        return this;
    }
}
