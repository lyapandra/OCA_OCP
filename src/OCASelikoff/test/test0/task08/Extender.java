package OCASelikoff.test.test0.task08;


class GrandPa {
    public static void main(String[] args) {
        GrandPa one = new GrandChild(5);
//        GrandPa parent = new Child();
        System.out.println();
        System.out.println(one.hasSon());
        System.out.println("\nGrandPa.shasSon() = " + GrandPa.shasSon());
        System.out.println("\nParent.shasSon() = " + Parent.shasSon());
        System.out.println("\nChild.shasSon() = " + Child.shasSon());
        System.out.println("\nGrandChild.shasSon() = " + GrandChild.shasSon());
//        System.out.println("GrandPa.hasSon() = " + new GrandPa.hasSon());
//        System.out.println("Parent.hasSon() = " + Parent.hasSon());
//        System.out.println("Child.hasSon() = " + Child.hasSon());
        System.out.println();
        Child child = new Child();
        System.out.println("child.hasSon() = " + child.hasSon());

        System.out.println();
        GrandChild grandChild2 = new GrandChild();
        System.out.println("GrandChild2.hasSon() = " + grandChild2.hasSon());
    }

    public GrandPa() {
        System.out.println("GrandPa()");
    }

    public GrandPa(int age)
//    private GrandPa(int age)
    {
        System.out.println("GrandPa(int age)");
    }
    String hasSon() {
//    String hasSon() {
        return "GrandPa.hasSon";
    }
    static String shasSon() {
//    String hasSon() {
        return "GrandPa.shasSon";
    }
}

class Parent extends GrandPa {
    public Parent() {
        System.out.println("Parent()");
    }
    public Parent(int age) {
        System.out.println("Parent(int age)");
    }

//    public String hasSon() {
    protected String hasSon() {
        return "Parent.hasSon";
    }
    protected static String shasSon() {
        return "Parent.shasSon";
    }
}

class Child extends Parent {
    public Child() {
        System.out.println("Child()");
    }
    public Child(int age) {
        System.out.println("Child(int age)");
    }

    protected String hasSon() {
        return "Child.hasSon";
    }
    protected static String shasSon() {
        return "Child.shasSon";
    }
}

class GrandChild extends Child{
    public GrandChild() {
        System.out.println("GrandChild()");
    }
    public GrandChild(int age) {
        System.out.println("GrandChild(int age)");
    }

    public String hasSon() {
        return "GrandChild.hasSon";
    }
    public static String shasSon() {
        return "GrandChild.shasSon";
    }
}
