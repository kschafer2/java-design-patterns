package design.patterns.composite.exercise.valuecontainer;

import java.util.ArrayList;
import java.util.Collection;

public class MyList extends ArrayList<ValueContainer> {

    public MyList(Collection<? extends ValueContainer> c)
    {
        super(c);
    }

    public int sum() {
        int sum = 0;

        for(ValueContainer vc : this) {
            for(Integer integer : vc) {
                sum += integer;
            }
        }
        return sum;
    }
}
