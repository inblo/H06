package org.example;

//### Принцип подстановки Лисков
// в Main иницализируем экземпляр класса-родителя PrintedProduct и подставляем в качестве переменной класс-наследник
// PrintedBook. Ведь класс PrintedBook всего лишь расширяет функционал PrintedProduct, а не меняет его.
// Все работает - ничего не сломалось//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
// принцип подстановки Лиски - класс PrintedBook можно заявить в качестве переменной для класса-родителя PrintedProduct

        PrintedProduct book1 = new PrintedBook("Маркес", "'Сто лет одиночества'", 2010, "f-500", 123456, "книга", 1001);
        PrintedProduct book2 = new PrintedBook("Толстой", "Война и мир", 1985, "а41-500", 123457, "книга", 1002);
        PrintedProduct book3 = new PrintedBook(null, null, null, null, 123458, "книга", 1003);
        PrintedProduct book4 = new PrintedBook(null, null, null, null, 123459, "книга", 1004);
        PrintedProduct book5 = new PrintedBook(null, "Библия", null, null, "A-567-32", "книга", 1004);

        PrintProductView inBooks = new PrintProductView();
        inBooks.addProduct(book1);
        inBooks.addProduct(book2);
        inBooks.addProduct(book3);
        inBooks.addProduct(book4);
        inBooks.addProduct(book5);

        System.out.println();
        inBooks.printInBooks();
        System.out.println();

        inBooks.outProduct(book3);
        inBooks.outProduct(book1);

        inBooks.printInBooks();
        System.out.println();
        inBooks.printOutBooks();

        // Product<String> book1 = new Product<>("Сказка о царе Салтане");
        // Product<String> book2 = new Product<>("Темные дыры и вселенная");
        // Product<Integer> book3 = new Product<>(1247689);
        // Product<Integer> book4 = new Product<>(1247890);
        // Product<Integer> book5 = new Product<>(124670);
        // List<Product> bookList = new ArrayList<>(List.of(book1, book2, book3));
        // List<Product> outList = new ArrayList<>();
        // Library library = new Library<>(bookList, outList);

        // //добавляем новые книжки в библиотеку
        // library.addOrReturnBook(book4);
        // library.addOrReturnBook(book5);

        // // закомментила, потому что по условию не требуется
        // // library.printInBooks();
        // // System.out.println();

        // library.outBook(book3);
        // library.outBook(book2);
        // library.outBook(book4);

        // library.printOutBooks();
        // //System.out.println();

        //library.printInBooks();
    }
}