package design.patterns.builder.fluent;

//For fluent, piecewise creation of a simple object

public class FluentBuilderDemo {
    public static void main(String[] args) {

        HtmlBuilder builder = new HtmlBuilder("ul");
        builder.addChild("li", "hello")
                .addChild("li", "world");

        System.out.println(builder);
    }
}
