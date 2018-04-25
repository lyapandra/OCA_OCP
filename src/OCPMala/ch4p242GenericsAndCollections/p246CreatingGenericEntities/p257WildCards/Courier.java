package OCPMala.ch4p242GenericsAndCollections.p246CreatingGenericEntities.p257WildCards;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by a on 25.04.2018.
 */
class Gift{}
class Book extends Gift{
    String title;
    Book(String title) {
        this.title = title;
    }
    public String toString() {
        return title;
    }
}
class Courier {
    public static void wrapGift(List<?> list) {
        System.out.print("GiftWrap - ");
//        for (Gift item : list) {
        for (Object item : list) {
            System.out.print(" - " + item);
        }
        System.out.println();
    }
    public static void main(String args[]) {
        List<Book> bookList = new ArrayList<Book>();
        bookList.add(new Book("Oracle"));
        bookList.add(new Book("Java"));
        wrapGift(bookList);

        List<String> stringList = new ArrayList<String>();
        stringList.add("Paul");
        stringList.add("Shreya");
        wrapGift(stringList);
    }
}