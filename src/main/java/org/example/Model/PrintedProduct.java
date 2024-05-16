package org.example.Model;
// ### Принцип открытости/закрытости
// Во всех классах оставляем пустые констркуторы на случай, если в будущем появятся наследники.

// PrintedProduct - Создаем класс-родитель для печатных изданий, чтобы в будущем можно было работать с газетами, журналами, рекламными брошюрамии т. д.,
//не залезая в класс книг. Все общее в печатных изданиях зашиваем в класс для печатных изданий и наследуем затем
//в классе официальных физических изданий OfficialPrintedProduct (из него выйдут газеты, журналы, книги и может быть что-то еще),
//а потом в классе аналоговых книг PrintedBook - в нем тоже оставим пустой конструктор как задел на будущее для новых классов.


public class PrintedProduct<T> extends Product<T>{
    public boolean isInSide;
    public boolean isOutSide;
    protected T type;
    protected T id;

    public PrintedProduct(T type, T id) {
        this.type = type;
        this.id = id;
    }

    public PrintedProduct() {
    }

    public void setType(T type) {
        this.type = type;
    }

    @Override
    public T getType() {
        return type;
    }
    public void setId(T id) {
        this.id = id;
    }

    @Override
    public T getId() {
        return id;
    }

    @Override
    public String toString() {
        return "\"" + type.toString() + "\"";
    }

    public void setInSide(boolean isInSide) {
        this.isInSide = isInSide;
    }

    public void setOutSide(boolean isOutSide) {
        this.isOutSide = isOutSide;
    }
}
