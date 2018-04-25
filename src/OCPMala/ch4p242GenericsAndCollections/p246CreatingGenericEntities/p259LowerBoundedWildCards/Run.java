package OCPMala.ch4p242GenericsAndCollections.p246CreatingGenericEntities.p259LowerBoundedWildCards;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by a on 25.04.2018.
 */
class Things{}
class Gift extends Things{}
class Book extends Gift{}
class Phone extends Gift{}

public class Run {
    public static void main(String[] args) {
        List<? super Gift> myList1 = new ArrayList<Gift>();
        List<? super Gift> myList2 = new ArrayList<Object>();
        //    List<? super Gift> myList3 = new ArrayList<Phone>();
        List<? super Phone> myList4 = new ArrayList<Gift>();

        List<? super Gift> list = new ArrayList<Gift>();
        list.add(new Gift());
        list.add(new Book());
        list.add(new Phone());
//        list.add(new Things());
//        list.add(new Object());
        for (Object obj : list) {
            System.out.println(obj);
        }
        System.out.println("obj do as Object");

        List<? super Object> listObj = new ArrayList<>();
        listObj.add(new Gift());
        listObj.add(new Book());
        listObj.add(new Phone());
        listObj.add(new Things());
        listObj.add(new Object());
        for (Object obj : listObj) {
            System.out.println(obj);
        }
        System.out.println("obj do as Object");

        List<? super Things> listThng = new ArrayList<>();
        listThng.add(new Gift());
        listThng.add(new Book());
        listThng.add(new Phone());
        listThng.add(new Things());
//        listThng.add(new Object());
        for (Object obj : listThng) {
            System.out.println(obj);
        }
        System.out.println("obj do as Object");
    }
}
