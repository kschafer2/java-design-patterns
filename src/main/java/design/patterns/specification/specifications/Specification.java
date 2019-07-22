package design.patterns.specification.specifications;

public interface Specification<T> {

    boolean isSatisfied(T item);
}
