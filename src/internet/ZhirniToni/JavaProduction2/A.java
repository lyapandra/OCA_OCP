package internet.ZhirniToni.JavaProduction2;

/**
 * Created by a on 04.04.2018.
 */
public class A {
    public static String stat;
    public  String var;

    /*public A(String var) {
        this.var = var;
    }*/
}
 class Cube {
     public int x;
     public int y;
     public int z;
     public String name = "Cube";

     public Cube(int x, int y, int z) {
         this.x = x;
         this.y = y;
         this.z = z;
         this.name = name;
     }

     public void param(int x) {
         System.out.println("x = " + x);
     }

     public void param(int x, int y) {
         System.out.println("P = " + (x + y) * 2);
     }

     public void param(int x, int y, int z) {
         System.out.println("V = " + x * y * z);
     }

     public void name() {
         System.out.println("name = " + name);
     }

     class Paral {
         public int x;
         public int y;
         public int z;
         public String name = "Paral";

         public Paral(int x, int y, int z) {
             this.x = x;
             this.y = y;
             this.z = z;
             this.name = name;
         }

         public void param(int x) {
             System.out.println("x = " + x);
         }

         public void param(int x, int y) {
             System.out.println("P = " + (x + y) * 2);
         }

         public void param(int x, int y, int z) {
             System.out.println("V = " + x * y * z);
         }

         public void name() {
             System.out.println("name = " + name);
         }
     }
 }