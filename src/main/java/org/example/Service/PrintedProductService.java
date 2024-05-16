package org.example.Service;

import java.util.ArrayList;
//###Принцип единственной ответственности:
//в этом классе реализуем операции, которые возможно только с аналоговыми изданиями
// не стала разделять ввыдачу и получение изданий в разные классы, поскольку они очень взаимосвязаны между собой
public class PrintedProductService<T>implements AddProductInterface<T>, OutProductInterface<T> {
    // инициализируем список книг в наличии
    private List<T> inProducts = new ArrayList<>();
    // инициализируем список выданных книг
    private List<T> outProducts = new ArrayList<>();

    @Override
    public void addProduct(T product) {
        if (outProducts != null) {
            if (outProducts.contains(product)) {
                outProducts.remove(product);
            }
        }
        inProducts.add(product);
    }

    public List<T> getInProductsList() {
        return inProducts;
    }

    public void outProduct(T product) {
        outProducts.add(product);
        inProducts.remove(product);
    }

    public List<T> getOutProductsList() {
        return outProducts;
    }
}
