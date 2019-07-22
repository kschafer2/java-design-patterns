package design.patterns.specification;

import design.patterns.specification.filters.ProductFilter;
import design.patterns.specification.model.Color;
import design.patterns.specification.model.Product;
import design.patterns.specification.model.Size;
import design.patterns.specification.specifications.AndSpecification;
import design.patterns.specification.specifications.ColorSpecification;
import design.patterns.specification.specifications.SizeSpecification;

import java.util.List;

//for elegant object filtration

public class SpecificationDemo {
    public static void main(String[] args) {
        Product apple = new Product("Apple", Color.GREEN, Size.SMALL);
        Product tree = new Product("Tree", Color.GREEN, Size.LARGE);
        Product house = new Product("House", Color.BLUE, Size.LARGE);

        List<Product> products = List.of(apple, tree, house);

        ProductFilter productFilter = new ProductFilter();

        System.out.println("Green products: ");
        productFilter.filter(products, new ColorSpecification(Color.GREEN))
                .forEach(product -> System.out.println(" - " + product + " is green"));

        System.out.println("\nLarge, blue products: ");
        productFilter.filter(products,
                new AndSpecification<>(
                        new ColorSpecification(Color.BLUE),
                        new SizeSpecification(Size.LARGE)
                ))
                .forEach(product -> System.out.println(" - " + product + " is large and blue"));
    }
}
