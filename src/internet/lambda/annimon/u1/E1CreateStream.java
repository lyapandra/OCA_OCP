package internet.lambda.annimon.u1;
//https://annimon.com/article/2778

import java.util.*;
import java.util.stream.Collectors;

public class E1CreateStream {
    public static void main(String[] args) {
        System.out.println("Created Streams:");
        E1CreateStream e1CreateStream = new E1CreateStream();
        e1CreateStream.CreateStringArrayStream();
        e1CreateStream.CreateListStream();
        e1CreateStream.CreateMapStream();
    }

    public List<String> CreateStringArrayStream() {
        System.out.print("Stream from Array ");
        String[] strArr = {"1", "2"};
        List<String> arr = Arrays.stream(strArr)
//                .filter(s -> s.length() <= 2)
                .collect(Collectors.toList());
        arr.forEach(System.out::print);
        return arr;
    }

    public List<Integer> CreateIntArrayStream() {
        System.out.print("Stream from Array ");
        Integer [] intArr = {-2,-1,0,1,2};

        List<Integer> arr = Arrays.stream(intArr)
                .collect(Collectors.toList());
        arr.forEach(System.out::print);
        return arr;
    }

    public List<String> CreateListStream() {
        System.out.print("\nStream from List ");

        List<String> list = new ArrayList<>();
        list.add("01");
        list.add("02");
        list.stream();
        list.forEach(System.out::print);
        return list;
    }

    public Map<Integer, String> CreateMapStream() {
        System.out.print("\nStream from Map:\n");
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Germany");
        map.put(2, "Spain");
        map.put(4, "France");
        map.put(3, "Italy");
        map.forEach((k, v) -> System.out.println(k + " - " + v));
        System.out.println("2nd way:");
        map.entrySet().stream()
                .forEach(e -> System.out.println(e.getKey() + " + " + e.getValue()));
        return map;
    }
}