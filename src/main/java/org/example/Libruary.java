package org.example;

import org.example.Model.Product;
//* Создайте класс Library, который будет представлять библиотеку.
//У этого класса должны быть методы для добавления и выдачи книг.
public class Libruary<T extends Product<T>> {
     // создаем список из книг в наличии:
     private List<T> inBooks;
     // содаем список выданных книг
     private List<T> outBooks;

     public Libruary(List<T> inBooksList, List<T> outBooksList) {
         inBooks = inBooksList;
         outBooks = outBooksList;
     }

     // добавляем новые книги или возвращаем книги в библиотеку
     public void addOrReturnBook(T book) {
         if (outBooks != null) {
             if (outBooks.contains(book)) {
                 outBooks.remove(book);
             }
         }
         inBooks.add(book);
     }

     // выдаем книги : добавляем книгу в список выданных книг и одновременно убираем из книг в наличии
     public void outBook(T book) {
         outBooks.add(book);
         inBooks.remove(book);
     }

     // создаем метод для распечатки выданных книг
     public void printOutBooks() {
         System.out.println("Эти книги на данный моменты выданы на руки читателям:");
         for (T book : outBooks) {
             System.out.println(book);
         }
     }
     // создаем метод для распечатки выданных книг - больше для проверки, закомментируем
      public void printInBooks() {
          System.out.println("Эти книги есть в наличии:");
          for (T book : inBooks) {
              System.out.println(book);
          }
      }
 }