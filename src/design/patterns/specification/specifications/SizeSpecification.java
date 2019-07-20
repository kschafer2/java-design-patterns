package design.patterns.specification.specifications;

import design.patterns.specification.model.Product;
import design.patterns.specification.model.Size;

public class SizeSpecification implements Specification<Product> {

    private Size size;

    public SizeSpecification(Size size) {
        this.size = size;
    }

    @Override
    public boolean isSatisfied(Product item) {
        return item.getSize() == size;
    }
}
