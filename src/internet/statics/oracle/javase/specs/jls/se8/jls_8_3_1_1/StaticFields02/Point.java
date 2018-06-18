package internet.statics.oracle.javase.specs.jls.se8.jls_8_3_1_1.StaticFields02;
//Example 8.3.1.1-2. Hiding of Class Variables
class Point {
    static int x = 2;
}
class Test extends Point {
    static double x = 4.7;
//    double x = 4.7;
    public static void main(String[] args) {
        new Test().printX();
    }
    void printX() {
        System.out.println("x = " + x);
        System.out.println("super.x = " + super.x);
    }
}