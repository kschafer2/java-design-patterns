package design.patterns.decorator.model;

public class Bird {
    public int age;

    public String fly() {
        return age < 10 ? "flying" : "too old";
    }
}
