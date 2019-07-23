package design.patterns.adapter.caching.adapters;

import design.patterns.adapter.caching.model.Line;
import design.patterns.adapter.caching.model.Point;

import java.util.*;
import java.util.function.Consumer;

public class LineToPointAdapter implements Iterable<Point> {

    private static int count = 0;
    private static Map<Integer, List<Point>> cache = new HashMap<>();
    private int hash;


    public LineToPointAdapter(Line line) {

        hash = line.hashCode();

        if(cache.containsKey(hash)) {
            return;
        }

        int x1 = line.getStart().getX();
        int y1 = line.getStart().getY();
        int x2 = line.getEnd().getX();
        int y2 = line.getEnd().getY();

        System.out.println(
                String.format("%d: Generating points for line [%d,%d]-[%d,%d] (caching)",
                        ++count, x1, y1, x2, y2));

        ArrayList<Point> points = new ArrayList<>();

        int left = Math.min(x1, x2);
        int right = Math.max(x1, x2);
        int top = Math.min(y1, y2);
        int bottom = Math.max(y1, y2);
        int dx = right - left;
        int dy = y2 - y1;

        if(dx == 0) {
            for(int y = top; y <= bottom; ++y) {
                points.add(new Point(left, y));
            }
        }
        else if(dy == 0) {
            for(int x = left; x <= right; ++x) {
                points.add(new Point(x, top));
            }
        }
        cache.put(hash, points);
    }

    @Override
    public void forEach(Consumer<? super Point> action) {
        cache.get(hash).forEach(action);
    }

    @Override
    public Spliterator<Point> spliterator() {
        return cache.get(hash).spliterator();
    }

    @Override
    public Iterator<Point> iterator() {
        return cache.get(hash).iterator();
    }
}
