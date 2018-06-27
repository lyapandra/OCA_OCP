package internet.polymorph.poly001;

import internet.generic.animon.Garage;

import java.util.ArrayList;

//http://qaru.site/questions/304040/overloading-is-compile-time-polymorphism-really
public class Greeter {
    public void greetMe(Object obj) {
        System.out.println("Hello Object!");
    }
    public void greetMe(String str) {
        System.out.println("Hello String!");
    }
    public void greetMe(Integer i) {
        System.out.println("Hello Integer!");
    }

//    todo: return

    public static void main(String[] args) {
        Object obj = new Object();
        String str = "blah";
        Object strAsObj = str;
        Integer i = 10;
        Object iAsObj = i;

        Object iAsObjNew = new Integer(10);

        Greeter greeter = new Greeter();
        greeter.greetMe(obj); // prints "Hello Object!"
        greeter.greetMe(str); // prints "Hello String!"
        greeter.greetMe(strAsObj); // prints "Hello Object!"
        greeter.greetMe(iAsObj); // prints "Hello Object!"
        greeter.greetMe(iAsObjNew); // prints "Hello Object!"

        Object o = new ArrayList<Integer>();
        ((ArrayList) o).add(0);
        ((ArrayList) o).add(1);
        ((ArrayList) o).add(2);
        int iSize = ((ArrayList) o).size();
        System.out.println("iSize = " + iSize);
    }
}