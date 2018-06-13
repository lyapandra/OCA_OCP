package internet.exception.metanit;

import java.lang.reflect.Array;
//chain of exceptions
public class ExceptionExample07my {
    public static void main(String[] args) {
        int a[]={0};
        try{
            System.out.println("a[100] = " + a[100]);
        }
        catch (ArrayIndexOutOfBoundsException ex2){
            System.out.println("ArrayIndexOutOfBoundsException");
            ex2.printStackTrace();
        }
        catch (IndexOutOfBoundsException ex2){
            System.out.println("IndexOutOfBoundsException");
            ex2.printStackTrace();
        }
        catch (RuntimeException ex1){
            System.out.println("RuntimeException");
            ex1.printStackTrace();
        }
        catch (Exception ex){
            System.out.println("Exception");
            ex.printStackTrace();
        }
    }
}
