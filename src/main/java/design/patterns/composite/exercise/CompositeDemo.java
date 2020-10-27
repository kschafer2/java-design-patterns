package design.patterns.composite.exercise;

import design.patterns.composite.exercise.valuecontainer.ManyValues;
import design.patterns.composite.exercise.valuecontainer.MyList;
import design.patterns.composite.exercise.valuecontainer.SingleValue;

import java.util.List;

//expected answer: 42
public class CompositeDemo {
    public static void main(String[] args) {
        ManyValues manyValues = new ManyValues();
        manyValues.add(20);
        manyValues.add(12);

        MyList myList = new MyList(List.of(new SingleValue(5), new SingleValue(5), manyValues));

        int sum = myList.sum();

        System.out.println(sum);
    }
}
