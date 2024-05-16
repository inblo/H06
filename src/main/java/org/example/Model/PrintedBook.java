package org.example.Model;
// ### Принцип открытости/закрытости
//создаем класс физических книг: в нем две новые переменные, остальные наследованы от родителей

//### Принцип подстановки Лисков
//класс PrintedBook всего лишь расширяет функционал PrintedProduct, а не меняет его.

//### Принцип единственной ответственности
// класс только заводит экземпляр, больше никаких операций с ними не делает.

public class PrintedBook<T> extends OfficialPrintedProduct<T>{
    protected T isbn;
    protected String authors;

    public PrintedBook(String authors, String title, Integer year, T isbn, T vendorCode, T type, T id) {
        super(vendorCode, title, type, id, year);
        this.authors = authors;
        this.isbn = isbn;
    }

    public PrintedBook() {
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public T getIsbn() {
        return isbn;
    }

    public void setIsbn(T isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "{"+ authors + ", " +
                title + ", " +
                String.format("%d", year)+ ", "+
                String.format("%s", vendorCode) + ", " +
                String.format("%s", isbn) +
                "}";
        //T isbn, T vendorCode,
    }
}
