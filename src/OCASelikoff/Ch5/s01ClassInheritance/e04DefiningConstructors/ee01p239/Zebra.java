package OCASelikoff.Ch5.s01ClassInheritance.e04DefiningConstructors.ee01p239;

/**
 * Created by a on 22.03.2018.
 */
public class Zebra extends OCASelikoff.Ch5.s01ClassInheritance.e04DefiningConstructors.ee01p239.Animal {
    static String name;
    int age;
    public Zebra(int age) {
        super(age);
        this.age = age;
    }
    public Zebra() {
        this(4);
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Zebra.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}