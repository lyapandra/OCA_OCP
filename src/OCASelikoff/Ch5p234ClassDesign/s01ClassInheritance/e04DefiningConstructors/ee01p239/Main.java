package OCASelikoff.Ch5p234ClassDesign.s01ClassInheritance.e04DefiningConstructors.ee01p239;

/**
 * Created by a on 22.03.2018.
 */
public class Main {
    public static void main(String[] args) {
        Zebra zebra1 = new Zebra(9);
        System.out.println("zebra1.age = " + zebra1.age);
        zebra1.setName("Zebra1");
        System.out.println("zebra1.name = " + zebra1.name);
        System.out.println("************************");
        Zebra zebra2 = new Zebra();
        zebra2.setName("Zebra2");
        System.out.println("zebra2.age = " + zebra2.age);
        System.out.println("zebra1.name = " + zebra1.name);

        System.out.println("zebra1.age = " + zebra1.age);
        System.out.println("zebra1.name = " + zebra1.name);
    }
}
