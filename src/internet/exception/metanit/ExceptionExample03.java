package internet.exception.metanit;

public class ExceptionExample03 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        try{
            //why:execute 1 or 2 printStackTrace depend changing line 8 or 9?
            numbers[6]=Integer.parseInt("gfd");
            numbers[6]=45;
        }
        catch(ArrayIndexOutOfBoundsException ex){

            System.out.println("Выход за пределы массива");
            ex.printStackTrace();
        }
        catch(NumberFormatException ex){

            System.out.println("Ошибка преобразования из строки в число");
            ex.printStackTrace();
        }
        System.out.println("that's all");
    }
}
