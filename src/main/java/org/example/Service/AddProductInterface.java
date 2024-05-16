package org.example.Service;
// ### Принцип разделения интерфейсов
// В папке Service создаем два интерфейса: на выдачу и прием продукта. Для физических носителей это важно.
// А для оцифрованных документов, которые есть в базе библиотеки, может понадобиться только добавление в базу.
public class AddProductInterface<T> {
    void addProduct(T product);
}
