package design.patterns.decorator.model;

public class Dragon {
    private Bird bird;
    private Lizard lizard;

    public Dragon() {
        bird = new Bird();
        lizard = new Lizard();
    }

    public void setAge(int age) {
        this.bird.age = age;
        this.lizard.age = age;
    }

    public String fly() {
        return bird.fly();
    }

    public String crawl() {
        return lizard.crawl();
    }
}
