https://docs.oracle.com/javase/specs/jls/se7/html/jls-11.html
https://docs.oracle.com/javase/7/docs/api/java/lang/Throwable.html
https://jsehelper.blogspot.com/2016/01/java-core-3.html

http://developer.alexanderklimov.ru/android/java/exception.php
RuntimeException не нужно включать в список throws. 
#Вот небольшой список непроверяемых исключений.
ArithmeticException - арифметическая ошибка, например, деление на нуль
ArrayIndexOutOfBoundsException - выход индекса за границу массива
ArrayStoreException - присваивание элементу массива объекта несовместимого типа
ClassCastException - неверное приведение
EnumConstantNotPresentException - попытка использования неопределённого значения перечисления
IllegalArgumentException - неверный аргумент при вызове метода
IllegalMonitorStateException - неверная операция мониторинга
IllegalStateException - некорректное состояние приложения
IllegalThreadStateException - запрашиваемая операция несовместима с текущим потоком
IndexOutofBoundsException - тип индекса вышел за допустимые пределы
NegativeArraySizeException - создан массив отрицательного размера
NullPointerException - неверное использование пустой ссылки
NumberFormatException - неверное преобразование строки в числовой формат
SecurityException - попытка нарушения безопасности
StringIndexOutOfBounds - попытка использования индекса за пределами строки
TypeNotPresentException - тип не найден
UnsupportedOperationException - обнаружена неподдерживаемая операция

#Список проверяемых системных исключений, которые можно включать в список throws:
ClassNotFoundException - класс не найден
CloneNotSupportedException - попытка клонировать объект, который не реализует интерфейс Cloneable
IllegalAccessException - запрещен доступ к классу
InstantiationException - попытка создать объект абстрактного класса или интерфейса
InterruptedException - поток прерван другим потоком
NoSuchFieldException - запрашиваемое поле не существует
NoSuchMethodException - запрашиваемый метод не существует
ReflectiveOperationException - исключение, связанное с рефлексией