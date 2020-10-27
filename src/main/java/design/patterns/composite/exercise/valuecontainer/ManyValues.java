package design.patterns.composite.exercise.valuecontainer;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Iterator;

public class ManyValues extends ArrayList<Integer> implements ValueContainer
{
    @NotNull
    @Override
    public Iterator<Integer> iterator() {
        return super.iterator();
    }
}
