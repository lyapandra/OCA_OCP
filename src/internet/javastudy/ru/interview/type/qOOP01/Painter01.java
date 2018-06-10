package internet.javastudy.ru.interview.type.qOOP01;

public class Painter01{
    public static void main(String[] args) {
        System.out.println("class Painter01");
        Shape shape1 = new Circle();
        System.out.println("((Circle) shape1).name = " + ((Circle) shape1).name);
        Shape t = new Triangle();
//        c.draw();
//        t.draw();
    drawtest(shape1);
    drawtest(t);
    drawtest(new Shape()
    {
        @Override
        public void draw() {
            System.out.println("new Shape");
        }
    });
    }

    public static void drawtest(Shape s){
        s.draw();
    }
}

//Circle.draw()
//Triangle.draw()
