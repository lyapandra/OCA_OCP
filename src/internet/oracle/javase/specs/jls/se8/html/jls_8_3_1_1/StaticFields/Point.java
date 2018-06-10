package internet.oracle.javase.specs.jls.se8.html.jls_8_3_1_1.StaticFields;

class Point {
    int x, y, useCount;
    Point(int x, int y) { this.x = x; this.y = y; }
    static final Point origin = new Point(0, 0);
}
class Test {
    public static void main(String[] args) {
        Point p = new Point(1,1);
        Point q = new Point(2,2);
        p.x = 3;
        p.y = 3;
        p.useCount++;
        p.origin.useCount++;
        p.origin.useCount++;
        System.out.println("(" + q.x + "," + q.y + ")");
        System.out.println("q.useCount = " + q.useCount);
        System.out.println("p.useCount = " + p.useCount);
        System.out.println("q.origin.useCount = " + q.origin.useCount);
        System.out.println("q.origin == Point.origin = " + (q.origin == Point.origin));
        System.out.println("q.useCount = " + q.useCount);
        System.out.println("p.useCount = " + p.useCount);

    }
}