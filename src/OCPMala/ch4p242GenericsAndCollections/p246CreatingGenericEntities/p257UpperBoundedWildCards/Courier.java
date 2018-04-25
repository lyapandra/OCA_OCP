package OCPMala.ch4p242GenericsAndCollections.p246CreatingGenericEntities.p257UpperBoundedWildCards;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by a on 25.04.2018.
 */
class Gift{}

class Book extends Gift {
    String title;
    Book(String title) {
        this.title = title;
    }
    public String toString() {
        return title;
    }
}

class Phone extends Gift {
    String title;
    Phone(String title) {
        this.title = title;
    }
    public String toString() {
        return title;
    }
}

class Courier {
    public static void wrapGift(List<? extends Gift> list) {
        System.out.print("GiftWrap - ");
        for (Gift item : list) {
//        for (Object item : list) { //+
            System.out.print(" - " + item);
        }
        System.out.println();
    }
    public static void main(String args[]) {
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("Oracle"));
//        bookList.add(new Object());
        bookList.add(new Book("Java"));
        wrapGift(bookList);

        List<Phone> phoneList = new ArrayList<>();
        phoneList.add(new Phone("1st parcel"));
        phoneList.add(new Phone("2nd parcel"));
        wrapGift(phoneList);

        System.out.println("item do as Object");
/*
        List<String> stringList = new ArrayList<String>();
        stringList.add("Paul");
        stringList.add("Shreya");
        wrapGift(stringList);
*/
    }
}