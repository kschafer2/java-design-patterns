package design.patterns.prototype.serialization;

import java.io.Serializable;

public class Foo implements Serializable {

    private String[] whatever;

    public Foo(String[] whatever) {
        this.whatever = whatever;
    }

    public String[] getWhatever() {
        return whatever;
    }

    public void setWhatever(String whatever[]) {
        this.whatever = whatever;
    }

    @Override
    public String toString() {
        return super.toString() + "{" +
                "whatever='" + whatever + '\'' +
                '}';
    }


}
