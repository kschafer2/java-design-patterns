package design.patterns.prototype.copyconstructor.model;

public class Employee {

    private String name;
    private Address address;

    public Employee(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Employee(Employee other) {
        this(other.name, new Address(other.address));
    }

    @Override
    public String toString() {
        return super.toString() + "{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
