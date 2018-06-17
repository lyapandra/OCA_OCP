#Generics

<a href>https://annimon.com/article/2637>Обобщения в Java (Java Generics)</a>

[Article GitHub Generics Code](https://github.com/annimon-tutorials/Java-Generics-Tutorial/tree/master/src/main/java/com/example/generics/step8)

* ограничение <? extends T> считается ковариантным, <? super T> контравариантным, а <T> инвариантным подставляемому типу

* Верхняя границa: <? extends SomeClass>.

* Нижняя граница подстановки: <? super SomeClass>.

* \<?> - тип абсолютно неизвестен или он нас не волнует, а нам нужно его правильно обработать не потеряв типизацию.  

##PECS
 ###Producer Extends Consumer Super.

1. Если аргумент используется как поставщик, то есть нужно что-то взять из объекта, то используется `<? extends SomeClass>`.  
2. Если аргумент используется как потребитель, то есть нужно что-то положить в объект, то используется `<? super SomeClass>`.  
1. Если аргумент используется как для чтения, так и для записи, то ограничения не накладывается и нужно использовать `<SomeClass>` или просто `<T>`.