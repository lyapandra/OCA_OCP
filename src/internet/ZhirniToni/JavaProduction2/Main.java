package ZhirniToni.JavaProduction2;

public class Main {
    public static void main(String[] args) {
        A a = new A();

        System.out.println("a.stat = " + a.stat);
        System.out.println("a.var = " + a.var);
        a.stat="a.stat";
        a.var = "a.var";
        System.out.println("a.stat = " + a.stat);
        System.out.println("a.var = " + a.var);

        A b = new A();
        a.stat="B.stat";
        b.var = "b.var";
        System.out.println("b.stat = " + b.stat);
        System.out.println("b.var = " + b.var);
        System.out.println("a.var = " + a.var);


//        Cube cube = new Cube(1,2,3);
//        cube.param(1,2,4);;
    }
}
