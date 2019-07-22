package design.patterns.prototype.serialization;

//used when making a deep copy of a complex object is easier than
//creating a new object from scratch

//serialization allows for deep copying no matter how complex the object

import org.apache.commons.lang3.SerializationUtils;

public class PrototypeDemo {
    public static void main(String[] args) {
        Foo foo = new Foo(new String[]{"life", "plates", "foliage"});

        //serializes and de-serializes the object, making a
        //deep copy of the object, including all contained objects
        Foo bar = SerializationUtils.roundtrip(foo);

        System.out.println(foo);
        System.out.println(bar);
    }


}
