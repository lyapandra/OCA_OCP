package internet.collectionTask;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;
class Run {
    public static void main(String[] args) {
        _Map m = new _Map();
        _Deque d = new _Deque();

    }
}
class _Collection implements Collection{
    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @NotNull
    @Override
    public Iterator iterator() {
        return null;
    }

    @NotNull
    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(@NotNull Collection c) {
        return false;
    }

    @Override
    public boolean removeIf(Predicate filter) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Spliterator spliterator() {
        return null;
    }

    @Override
    public Stream stream() {
        return null;
    }

    @Override
    public Stream parallelStream() {
        return null;
    }

    @Override
    public boolean retainAll(@NotNull Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(@NotNull Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(@NotNull Collection c) {
        return false;
    }

    @NotNull
    @Override
    public Object[] toArray(@NotNull Object[] a) {
        return new Object[0];
    }
}

class _AbstractMap extends AbstractMap{
    @Override
    public Set<Entry> entrySet() {
        return null;
    }
}
class _Map implements Map{

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean containsKey(Object key) {
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    @Override
    public Object get(Object key) {
        return null;
    }

    @Nullable
    @Override
    public Object put(Object key, Object value) {
        return null;
    }

    @Override
    public Object remove(Object key) {
        return null;
    }

    @Override
    public void putAll(@NotNull Map m) {

    }

    @Override
    public void clear() {

    }

    @NotNull
    @Override
    public Set keySet() {
        return null;
    }

    @NotNull
    @Override
    public Collection values() {
        return null;
    }

    @NotNull
    @Override
    public Set<Entry> entrySet() {
        return null;
    }

    @Override
    public Object getOrDefault(Object key, Object defaultValue) {
        return null;
    }

    @Override
    public void forEach(BiConsumer action) {

    }

    @Override
    public void replaceAll(BiFunction function) {

    }

    @Nullable
    @Override
    public Object putIfAbsent(Object key, Object value) {
        return null;
    }

    @Override
    public boolean remove(Object key, Object value) {
        return false;
    }

    @Override
    public boolean replace(Object key, Object oldValue, Object newValue) {
        return false;
    }

    @Nullable
    @Override
    public Object replace(Object key, Object value) {
        return null;
    }

    @Override
    public Object computeIfAbsent(Object key, Function mappingFunction) {
        return null;
    }

    @Override
    public Object computeIfPresent(Object key, BiFunction remappingFunction) {
        return null;
    }

    @Override
    public Object compute(Object key, BiFunction remappingFunction) {
        return null;
    }

    @Override
    public Object merge(Object key, Object value, BiFunction remappingFunction) {
        return null;
    }
}
class _LinkedHashMap extends LinkedHashMap{}
abstract class _SortedMap implements SortedMap {
    @Override
    public Comparator comparator() {
        return null;
    }

    @NotNull
    @Override
    public SortedMap subMap(Object fromKey, Object toKey) {
        return null;
    }

    @NotNull
    @Override
    public SortedMap headMap(Object toKey) {
        return null;
    }

    @NotNull
    @Override
    public SortedMap tailMap(Object fromKey) {
        return null;
    }

    @Override
    public Object firstKey() {
        return null;
    }

    @Override
    public Object lastKey() {
        return null;
    }

    @Override
    public Set keySet() {
        return null;
    }

    @Override
    public Collection values() {
        return null;
    }

    @Override
    public Set<Entry> entrySet() {
        return null;
    }
}
abstract class _NavigableMap implements NavigableMap{
    @Override
    public Entry lowerEntry(Object key) {
        return null;
    }

    @Override
    public Object lowerKey(Object key) {
        return null;
    }

    @Override
    public Entry floorEntry(Object key) {
        return null;
    }

    @Override
    public Object floorKey(Object key) {
        return null;
    }

    @Override
    public Entry ceilingEntry(Object key) {
        return null;
    }

    @Override
    public Object ceilingKey(Object key) {
        return null;
    }

    @Override
    public Entry higherEntry(Object key) {
        return null;
    }

    @Override
    public Object higherKey(Object key) {
        return null;
    }

    @Override
    public Entry firstEntry() {
        return null;
    }

    @Override
    public Entry lastEntry() {
        return null;
    }

    @Override
    public Entry pollFirstEntry() {
        return null;
    }

    @Override
    public Entry pollLastEntry() {
        return null;
    }

    @Override
    public NavigableMap descendingMap() {
        return null;
    }

    @Override
    public NavigableSet navigableKeySet() {
        return null;
    }

    @Override
    public NavigableSet descendingKeySet() {
        return null;
    }

    @Override
    public NavigableMap subMap(Object fromKey, boolean fromInclusive, Object toKey, boolean toInclusive) {
        return null;
    }

    @Override
    public NavigableMap headMap(Object toKey, boolean inclusive) {
        return null;
    }

    @Override
    public NavigableMap tailMap(Object fromKey, boolean inclusive) {
        return null;
    }

    @Override
    public SortedMap subMap(Object fromKey, Object toKey) {
        return null;
    }

    @Override
    public SortedMap headMap(Object toKey) {
        return null;
    }

    @Override
    public SortedMap tailMap(Object fromKey) {
        return null;
    }
}

abstract class _Queue implements Queue{
    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean offer(Object o) {
        return false;
    }

    @Override
    public Object remove() {
        return null;
    }

    @Nullable
    @Override
    public Object poll() {
        return null;
    }

    @Override
    public Object element() {
        return null;
    }

    @Nullable
    @Override
    public Object peek() {
        return null;
    }
}
class _Deque implements Deque{

    @Override
    public void addFirst(Object o) {

    }

    @Override
    public void addLast(Object o) {

    }

    @Override
    public boolean offerFirst(Object o) {
        return false;
    }

    @Override
    public boolean offerLast(Object o) {
        return false;
    }

    @Override
    public Object removeFirst() {
        return null;
    }

    @Override
    public Object removeLast() {
        return null;
    }

    @Nullable
    @Override
    public Object pollFirst() {
        return null;
    }

    @Nullable
    @Override
    public Object pollLast() {
        return null;
    }

    @Override
    public Object getFirst() {
        return null;
    }

    @Override
    public Object getLast() {
        return null;
    }

    @Override
    public Object peekFirst() {
        return null;
    }

    @Override
    public Object peekLast() {
        return null;
    }

    @Override
    public boolean removeFirstOccurrence(Object o) {
        return false;
    }

    @Override
    public boolean removeLastOccurrence(Object o) {
        return false;
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean offer(Object o) {
        return false;
    }

    @Override
    public Object remove() {
        return null;
    }

    @Override
    public Object poll() {
        return null;
    }

    @Override
    public Object element() {
        return null;
    }

    @Override
    public Object peek() {
        return null;
    }

    @Override
    public void push(Object o) {

    }

    @Override
    public Object pop() {
        return null;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(@NotNull Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean retainAll(@NotNull Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(@NotNull Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(@NotNull Collection c) {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @NotNull
    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @NotNull
    @Override
    public Object[] toArray(@NotNull Object[] a) {
        return new Object[0];
    }

    @NotNull
    @Override
    public Iterator descendingIterator() {
        return null;
    }
}

class _List implements List{

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @NotNull
    @Override
    public Iterator iterator() {
        return null;
    }

    @NotNull
    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(@NotNull Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, @NotNull Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public void add(int index, Object element) {

    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @NotNull
    @Override
    public ListIterator listIterator() {
        return null;
    }

    @NotNull
    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @NotNull
    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean retainAll(@NotNull Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(@NotNull Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(@NotNull Collection c) {
        return false;
    }

    @NotNull
    @Override
    public Object[] toArray(@NotNull Object[] a) {
        return new Object[0];
    }
}

class _Set implements Set{
    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @NotNull
    @Override
    public Iterator iterator() {
        return null;
    }

    @NotNull
    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(@NotNull Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Spliterator spliterator() {
        return null;
    }

    @Override
    public boolean removeAll(@NotNull Collection c) {
        return false;
    }

    @Override
    public boolean retainAll(@NotNull Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(@NotNull Collection c) {
        return false;
    }

    @NotNull
    @Override
    public Object[] toArray(@NotNull Object[] a) {
        return new Object[0];
    }
}
abstract class _SortedSet implements SortedSet{

    @Nullable
    @Override
    public Comparator comparator() {
        return null;
    }

    @NotNull
    @Override
    public SortedSet subSet(Object fromElement, Object toElement) {
        return null;
    }

    @NotNull
    @Override
    public SortedSet headSet(Object toElement) {
        return null;
    }

    @NotNull
    @Override
    public SortedSet tailSet(Object fromElement) {
        return null;
    }

    @Override
    public Object first() {
        return null;
    }

    @Override
    public Object last() {
        return null;
    }

    @Override
    public Spliterator spliterator() {
        return null;
    }
}
abstract class _NavigableSet implements NavigableSet{
    @Nullable
    @Override
    public Object lower(Object o) {
        return null;
    }

    @Nullable
    @Override
    public Object floor(Object o) {
        return null;
    }

    @Nullable
    @Override
    public Object ceiling(Object o) {
        return null;
    }

    @Nullable
    @Override
    public Object higher(Object o) {
        return null;
    }

    @Nullable
    @Override
    public Object pollFirst() {
        return null;
    }

    @Nullable
    @Override
    public Object pollLast() {
        return null;
    }

    @NotNull
    @Override
    public Iterator iterator() {
        return null;
    }

    @NotNull
    @Override
    public NavigableSet descendingSet() {
        return null;
    }

    @NotNull
    @Override
    public Iterator descendingIterator() {
        return null;
    }

    @NotNull
    @Override
    public NavigableSet subSet(Object fromElement, boolean fromInclusive, Object toElement, boolean toInclusive) {
        return null;
    }

    @NotNull
    @Override
    public NavigableSet headSet(Object toElement, boolean inclusive) {
        return null;
    }

    @NotNull
    @Override
    public NavigableSet tailSet(Object fromElement, boolean inclusive) {
        return null;
    }

    @NotNull
    @Override
    public SortedSet subSet(Object fromElement, Object toElement) {
        return null;
    }

    @NotNull
    @Override
    public SortedSet headSet(Object toElement) {
        return null;
    }

    @NotNull
    @Override
    public SortedSet tailSet(Object fromElement) {
        return null;
    }
}
public class CollectionTask01 {
    public static void main(String[] args) {
        ArrayDeque arrayDeque = new ArrayDeque();


    }
    public void getCollection(){
        /*Collection<E> eCollection = new Collection<E>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @NotNull
            @Override
            public Iterator<E> iterator() {
                return null;
            }

            @NotNull
            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @NotNull
            @Override
            public <T> T[] toArray(@NotNull T[] a) {
                return null;
            }

            @Override
            public boolean add(E e) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(@NotNull Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(@NotNull Collection<? extends E> c) {
                return false;
            }

            @Override
            public boolean removeAll(@NotNull Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(@NotNull Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }
        };
        List<E> eList = new List<E>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @NotNull
            @Override
            public Iterator<E> iterator() {
                return null;
            }

            @NotNull
            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @NotNull
            @Override
            public <T> T[] toArray(@NotNull T[] a) {
                return null;
            }

            @Override
            public boolean add(E e) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(@NotNull Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(@NotNull Collection<? extends E> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, @NotNull Collection<? extends E> c) {
                return false;
            }

            @Override
            public boolean removeAll(@NotNull Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(@NotNull Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public E get(int index) {
                return null;
            }

            @Override
            public E set(int index, E element) {
                return null;
            }

            @Override
            public void add(int index, E element) {

            }

            @Override
            public E remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @NotNull
            @Override
            public ListIterator<E> listIterator() {
                return null;
            }

            @NotNull
            @Override
            public ListIterator<E> listIterator(int index) {
                return null;
            }

            @NotNull
            @Override
            public List<E> subList(int fromIndex, int toIndex) {
                return null;
            }
        }
        List<E> eList1 = new ArrayList<>;*/
//        ArrayList<E> eArrayList = new ArrayList<>();

    }

    public void TaskArrayList(){
        ArrayList<String> people = new ArrayList<>();
        // добавим в список ряд элементов
        people.add("Tom");
        people.add("Alice");
        people.add("Kate");
        people.add("Sam");
        people.add(1, "Bob"); // добавляем элемент по индексу 1

        System.out.println(people.get(1));// получаем 2-й объект
        people.set(1, "Robert"); // установка нового значения для 2-го объекта

        System.out.printf("ArrayList has %d elements \n", people.size());
        for(String person : people){

            System.out.println(person);
        }
        // проверяем наличие элемента
        if(people.contains("Tom")){

            System.out.println("ArrayList contains Tom");
        }

        // удалим несколько объектов
        // удаление конкретного элемента
        people.remove("Robert");
        // удаление по индексу
        people.remove(0);

        Object[] peopleArray = people.toArray();
        for(Object person : peopleArray){

            System.out.println(person);
        }
    }
public void TaskArrayDeque(){
    ArrayDeque<String> states = new ArrayDeque<String>();
    ArrayDeque<String> arrayDeque= new ArrayDeque<String>();
    states.add("Germany");
    states.addFirst("France"); // добавляем элемент в самое начало
    states.push("Great Britain"); // добавляем элемент в самое начало
    states.addLast("Spain"); // добавляем элемент в конец коллекции
    states.add("Italy");

    // получаем первый элемент без удаления
    String sFirst = states.getFirst();
    System.out.println(sFirst);     // Great Britain
    // получаем последний элемент без удаления
    String sLast = states.getLast();
    System.out.println(sLast);      // Italy

    System.out.printf("Queue size: %d \n", states.size());  // 5

    // перебор коллекции
    while(states.peek()!=null){
        // извлечение c начала
        System.out.println(states.pop());
    }

    // очередь из объектов Person
    ArrayDeque<Person> people = new ArrayDeque<Person>();
    people.addFirst(new Person("Tom"));
    people.addLast(new Person("Nick"));
    // перебор без извлечения
    for(Person p : people){

        System.out.println(p.getName());
    }
}
    class Person{

        private String name;
        public Person(String value){

            name=value;
        }
        String getName(){return name;}
}
}
