package internet.statics.e2Static;

public class DemoStatic2 {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();
        System.out.print("Parent.staticMethod() = " );
        Parent.staticMethod(); //Parent
        System.out.print("Child.staticMethod() = ");
        Child.staticMethod(); //Child
        System.out.print("parent.justMethod() = ");
        parent.justMethod();    //Parent
        System.out.print("child.justMethod() = ");
        child.justMethod();    //Child

        System.out.print("parent.justMethod() = ");
        parent.justMethod();    //Parent
        System.out.print("child.justMethod() = ");
        child.justMethod();    //Child

        System.out.println();

        Parent parentChild = new Child();
        System.out.print("parentChild.justMethod() = ");
        parentChild.justMethod();
        System.out.print("parentChild.staticMethod() = ");
        parentChild.staticMethod();

        parentChild.methodOnlyInParent();
        ((Child) parentChild).methodOnlyInChild();
    }
}

class Parent {

    public static void staticMethod() {
        System.out.println("StaticParent");
    }

    public void justMethod() {
        System.out.println("Parent");
    }
    
    public void methodOnlyInParent(){
        System.out.println("methodOnlyInParent");
    }
}

class Child extends Parent {
    public static void staticMethod() {
        System.out.println("StaticChild");
    }

    @Override
    public void justMethod() {
        System.out.println( "Child");;
    }

    public void methodOnlyInChild(){
        System.out.println("methodOnlyInChild");
    }
}

