package internet.javastudy.ru.interview.type.qOOP55;

import java.lang.reflect.Field;

public class SomeClass {

    private String name = "SomeNameString";
    private Integer x = 25;

}

class TestPrivateAccess {

    public static void main(String[] args) {
        SomeClass someClass = new SomeClass();

        try {
            Field reflectField = SomeClass.class.getDeclaredField("name"); //NoSuchFieldException e
            Field reflectField2 = SomeClass.class.getDeclaredField("x"); //NoSuchFieldException e
            System.out.println("reflectField = " + reflectField);
            System.out.println("reflectField2 = " + reflectField2);
            System.out.println();
            /* Если не дать доступ, то будет ошибка
            java.lang.IllegalAccessException: Class .. .TestPrivateAccess
            can not access a member of class .. .SomeClass with modifiers "private"
            */
            reflectField.setAccessible(true);
            reflectField2.setAccessible(true);

            String fieldValue = (String) reflectField.get(someClass); //IllegalAccessException ex
            Integer fieldValue2 = (Integer) reflectField2.get(someClass); //IllegalAccessException ex
            System.out.println(reflectField);//private java.lang.String ru.javastudy.interview.oop.privateFieldAccess.SomeClass.name
            System.out.println(fieldValue); //SomeNameString

            System.out.println(reflectField2);//private java.lang.Integer ru.javastudy.interview.oop.privateFieldAccess.SomeClass.x
            System.out.println(fieldValue2); //25
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();;
        }

    }
}