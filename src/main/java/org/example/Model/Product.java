package org.example.Model;
// 1. ### Прицип инверсии зависимостей.
// В библиотеке можно взять почитать не только книги, поэтому создаем абстрактный класс Product.
// В нем будет задан только один параметр - type.
// Для чего это нужно: оставляем библиотеке задел для заведения новых видов изданий, в том числе цифровых.
public abstract class Product<T> {
    protected T type;
    protected T id;

    public abstract T getType();

    public abstract T getId();

}
