package org.example;
//* Создайте обобщенный класс Book<T>, который представляет книгу в библиотеке.

//* Каждая книга должна содержать параметр типа T для ее названия.

public class Book <T>{
    private T name;

     public Book(T name) {
         this.name = name;
     }

     public Book() {
     }

     public T getName() {
         return name;
     }

     public void setName(T name) {
         this.name = name;
     }

     @Override
     public String toString() {
         return "\"" + name.toString() + "\"";
     }
 }

