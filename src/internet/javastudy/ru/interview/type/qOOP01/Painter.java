package internet.javastudy.ru.interview.type.qOOP01;

import OCASelikoff.ch5p234ClassDesign.q.q01.C;

interface Shape {
    String name = "super name";
    void draw();
//    public String getName;

//        void erase();
}

class ShapeImpl implements Shape {
    public String superName = "SuperString";
    @Override
    public void draw() {
        System.out.println("ShapeImpl");
    }
}

class Circle extends ShapeImpl {

    public String name = "Circle";
    //    private Circle(){
    public Circle(){
        System.out.println("consructor Circle");
        this.name = name;
        this.name = "Circle this name";
//        this.superName = super.name;
    }
    @Override
    public void draw() {
        System.out.println("superName = " + superName);
        System.out.println("Circle.draw()");
    }
}
class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Triangle.draw()");
    }
}

public class Painter {

        public static void main(String[] args) {
            System.out.println("class Painter");
            Shape shape1 = new Circle();
            System.out.println("((Circle) shape1).name = " + ((Circle) shape1).name);
//            String shape1.super.name =
            Shape shape2 = new Triangle();
            testPoly(shape1);
            testPoly(shape2);
        }

        public static void testPoly(Shape shape) {
            shape.draw();
        }
    }
//Circle.draw()
//Triangle.draw()
