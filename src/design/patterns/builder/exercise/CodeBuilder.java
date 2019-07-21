package design.patterns.builder.exercise;

public class CodeBuilder {

    private StringBuilder stringBuilder = new StringBuilder();

    public CodeBuilder(String className) {
        stringBuilder
                .append("public class ").append(className).append("\n{\n");
    }

    public CodeBuilder addField(String name, String type) {
        stringBuilder.append("  public ").append(type).append(" ").append(name).append(";\n");

        return this;
    }

    @Override
    public String toString() {
        stringBuilder.append("}");

        return stringBuilder.toString();
    }
}
