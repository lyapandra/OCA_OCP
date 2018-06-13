package internet.exception.metanit;

public class ExceptionExample01 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        /*Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 4
        at internet.exception.metanit.ExceptionExample01.main*/
        numbers[4]=45;
        System.out.println(numbers[4]);
    }
}
