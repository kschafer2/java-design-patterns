package design.patterns.composite.exercise.valuecontainer;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Iterator;

public class SingleValue implements ValueContainer
{
    public int value;

    // please leave this constructor as-is
    public SingleValue(int value)
    {
        this.value = value;
    }

    @NotNull
    @Override
    public Iterator<Integer> iterator() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(value);
        return list.iterator();
    }
}
