package internet.oracle.javase.specs.jls.se8.html.jls_8_3_1_1;
//https://docs.oracle.com/javase/specs/jls/se8/html/jls-8.html#jls-8.3.1.1
//Example 8.3.1.1-3. Hiding of Instance Variables
class Point {
    int x = 2;
}
class Test extends Point {
    int x = 4;
    void printBoth() {
        System.out.println(x + " " + super.x);
    }
    public static void main(String[] args) {
        Test sample = new Test();
        sample.printBoth();
        System.out.println(sample.x + " " + ((Point)sample).x);
    }
}