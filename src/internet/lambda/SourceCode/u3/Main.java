package internet.lambda.SourceCode.u3;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        System.out.println("\nCONSUMER\nvoid accept(T t)");

        Consumer<String > c1 = c -> System.out.println("c1 = " + c);
        c1.accept("myString");

        Consumer<String> c2 = System.out::println;
        c2.accept("5");

        Consumer<String> c3 = Main::druk;
        c2.accept("druk txt");

//        Database databaseConsreuctor = User::new("ADmin", "admin");

        Database database = User::new;
        User user = database.create("FirstUser","01");
        System.out.printf("Name: %s%nPassword: %s\n", user.getName(), user.getPassword());
//        System.out.println("Name: " + user.getName() + "Password:" + user.getPassword());

        Consumer<String> dbprint0 = userDB -> System.out.println("User Name: "+userDB);
        Consumer<String> dbprint = System.out::println;
        dbprint0.accept(user.getName());
        dbprint.accept(user.getPassword());

    }

    public static void druk(String txt) {
        System.out.println("txt = " + txt);
    }
}
