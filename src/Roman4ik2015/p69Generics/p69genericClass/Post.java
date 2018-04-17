package Roman4ik2015.p69Generics.p69genericClass;

/**
 * Created by a on 13.04.2018.
 */
public class Post <T1, T2 extends Number> {
    private T1 message;
    private T2 id;
// методы
public static void main(String[] args) {
    Post<String, Short> post1 = new Post<>();
    Post<StringBuilder, Long> post20 = new Post<>();
    Post<StringBuilder, Long> post21 = new Post<>();
    post21 = post20;
//    post21 = post1; //ERROR
    boolean b1 = post1 instanceof Post;
//    boolean b2 = post1 instanceof Post<String, Short>; //ERROR
}
}