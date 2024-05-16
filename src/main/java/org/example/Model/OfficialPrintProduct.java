package org.example.Model;
// ### Принцип открытости/закрытости
//     OfficialPrintedProduct - создаем класс оофициальных изданий - мало ли что может храниться в библиотеке напечатанного.
//В новый класс могут входить книги, журналы, газеты и возможно что-то еще - это уже пропишем в конкретных классах далее
//- и описывает общие свойства для этих видов изданий.
//     OfficialPrintedProduct наследует от класса PrintedProduct, который в свою очередь являетс янаследником Product.

public class OfficialPrintProduct<T> extends PrintedProduct<T>{
    protected T vendorCode;
    protected String title;
    protected Integer year;

    public OfficialPrintProduct(T vendorCode, String title, T type, T id, Integer year) {
        super(type, id);
        this.vendorCode = vendorCode;
        this.title = title;
        this.year = year;
    }

    public OfficialPrintProduct() {

    }

    public void setVendorCode(T vendorCode) {
        this.vendorCode = vendorCode;
    }

    public T getVendorCode() {
        return vendorCode;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}
