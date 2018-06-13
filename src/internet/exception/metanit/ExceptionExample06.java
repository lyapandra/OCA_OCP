package internet.exception.metanit;
//the same as ExceptionExample05, but CATCH just after TRY
public class ExceptionExample06 {
    public static void main(String[] args) {
        try{
            int result = getFactorial(6);
            System.out.println("result = " + result);
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    static int getFactorial(int num){
        int result=1;
        try{
            if(num<1) throw new Exception("The number is less than 1");
            for(int i=1; i<=num;i++){
                result*=i;
                System.out.println("resultIn = " + result);
            }
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
            result=num;
        }
        return result;
    }
}
