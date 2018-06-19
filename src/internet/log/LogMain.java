package internet.log;

public class LogMain {
    public static void main(String[] args) {
        Reader reader = new FileReader();
        String message = reader.read();
        System.out.println("message = " + message);


    }
}
