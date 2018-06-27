https://docs.oracle.com/javase/specs/jls/se7/html/jls-11.html
https://docs.oracle.com/javase/7/docs/api/java/lang/Throwable.html
https://docs.oracle.com/javase/7/docs/api/java/lang/RuntimeException.html
https://docs.oracle.com/javase/8/docs/api/java/lang/Exception.html
https://jsehelper.blogspot.com/2016/01/java-core-3.html

http://sources.ru/java/faq/runexc.htm
http://developer.alexanderklimov.ru/android/java/exception.php

The Java Exception Class Hierarchy 
https://airbrake.io/blog/java/the-java-exception-class-hierarchy

RuntimeException не нужно включать в список throws. 
#Вот небольшой список непроверяемых исключений.
1. [ArithmeticException - арифметическая ошибка, например, деление на нуль](https://docs.oracle.com/javase/7/docs/api/java/lang/ArithmeticException.html)  
1. ArrayStoreException - присваивание элементу массива объекта несовместимого типа
1. ClassCastException - неверное приведение
 _EnumConstantNotPresentException - попытка использования неопределённого значения перечисления_
1. IllegalArgumentException - неверный аргумент при вызове метода
1. IllegalMonitorStateException - неверная операция мониторинга
1. IllegalStateException - некорректное состояние приложения  
 _IllegalThreadStateException - запрашиваемая операция несовместима с текущим потоком_  
1. [IndexOutofBoundsException - тип индекса вышел за допустимые пределы)](https://docs.oracle.com/javase/7/docs/api/java/lang/IndexOutOfBoundsException.html)  
7.1. ArrayIndexOutOfBoundsException - выход индекса за границу массива  
7.2. StringIndexOutOfBounds - попытка использования индекса за пределами строки
1. NegativeArraySizeException - создан массив отрицательного размера
1. NullPointerException - неверное использование пустой ссылки  
_NumberFormatException - неверное преобразование строки в числовой формат_
1. SecurityException - попытка нарушения безопасности  
_TypeNotPresentException - тип не найден_
1. UnsupportedOperationException - обнаружена неподдерживаемая операция

#Список проверяемых системных (RuntimeEx) исключений, которые можно включать в список throws:
ClassNotFoundException - класс не найден
CloneNotSupportedException - попытка клонировать объект, который не реализует интерфейс Cloneable    
IllegalAccessException - запрещен доступ к классу  
InstantiationException - попытка создать объект абстрактного класса или интерфейса  
InterruptedException - поток прерван другим потоком  
 [IOException](https://docs.oracle.com/javase/7/docs/api/java/io/IOException.html)  
NoSuchFieldException - запрашиваемое поле не существует  
NoSuchMethodException - запрашиваемый метод не существует  
ReflectiveOperationException - исключение, связанное с рефлексией