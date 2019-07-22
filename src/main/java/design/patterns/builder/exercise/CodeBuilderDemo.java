package design.patterns.builder.exercise;

public class CodeBuilderDemo {
    public static void main(String[] args) {

        CodeBuilder codeBuilder = new CodeBuilder("Person")
                .addField("name", "String")
                .addField("age", "int");

        System.out.println(codeBuilder);
    }
}
