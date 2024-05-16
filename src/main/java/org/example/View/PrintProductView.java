package org.example.View;
// правило единственной ответственности тут заключается в том, что работаем только с напечатанными книгами

import org.example.Controller.PrintProductController;
import java.util.ArrayList;

public class PrintProductView<T> {
    PrintProductController bookController = new PrintProductController<>();

    public void addProduct (T product){
        bookController.addProductList(product);
    }

    public List<T> getInProductsList() {
        return bookController.getInProductsList();
    }

    public void outProduct(T product){
        bookController.outProduct(product);
    }
    public void printOutBooks() {
        List<T> outBooks = new ArrayList<>(bookController.getOutProductsList());
        System.out.println("Эти книги выданы на руки читателям:");
        for (T product : outBooks) {
            System.out.println(product);
        }
    }

    public void printInBooks() {
        List<T> inBooks = new ArrayList<>(bookController.getInProductsList());
        System.out.println("Эти книги есть в наличии:");
        for (T product : inBooks) {
            System.out.println(product);
        }
    }
}
