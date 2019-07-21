package design.patterns.builder.fluent;

import java.util.ArrayList;
import java.util.Collections;

public class HtmlElement {

    private String name, text;
    private ArrayList<HtmlElement> elements = new ArrayList<>();
    private final int indentSize = 2;
    private final String newLine = System.lineSeparator();

    public HtmlElement() {
    }

    public HtmlElement(String name, String text) {
        this.name = name;
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public ArrayList<HtmlElement> getElements() {
        return elements;
    }

    public void setElements(ArrayList<HtmlElement> elements) {
        this.elements = elements;
    }

    private String toStringImpl(int indent) {
        StringBuilder stringBuilder = new StringBuilder();
        String i = String.join("", Collections.nCopies(indent * indentSize, " "));

        stringBuilder.append(String.format("%s<%s>%s", i, name, newLine));

        if(text != null && !text.isEmpty()) {
            stringBuilder.append(String.join("", Collections.nCopies(indentSize*(indent+1), " ")))
                    .append(text)
                    .append(newLine);
        }

        for(HtmlElement element : elements) {
            stringBuilder.append(element.toStringImpl(indent + 1));
        }
            stringBuilder.append(String.format("%s</%s>%s", i, name, newLine));

            return stringBuilder.toString();
    }

    @Override
    public String toString() {
        return toStringImpl(0);
    }
}
