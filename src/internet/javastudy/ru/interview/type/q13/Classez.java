package internet.javastudy.ru.interview.type.q13;

public class Classez {
    public static void main(String[] args) {
//        Boolean b;
        Boolean b = false;
//        System.out.println("b.getClass().getSimpleName() = " + b.getClass().getSimpleName());
//        System.out.println("b.getClass().getSimpleName().getClass().getSimpleName() = " + b.getClass().getSimpleName().getClass().getSimpleName());
//        b = (b.getClass().getSimpleName().equals("Boolean"))?false:ret();
        b = (b.getClass().getSimpleName()=="Boolean")?false:true;
        System.out.println("b = " + b);
    }

    private static Boolean ret() {
        System.out.println("method ret()");
        return true;
    }
}
