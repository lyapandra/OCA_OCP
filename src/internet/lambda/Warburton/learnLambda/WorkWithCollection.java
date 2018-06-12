package internet.lambda.Warburton.learnLambda;

import internet.lambda.Warburton.chapter1.Album;
import internet.lambda.Warburton.chapter1.SampleData;
import internet.lambda.Warburton.chapter1.Track;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static com.google.common.primitives.Ints.asList;
import static java.util.stream.Collectors.toList;

public class WorkWithCollection {
    public static void main(String[] args) {
        List<Integer> aList = asList(10, 3, 5, 9);
        System.out.println("aList = " + aList);
        List<Integer> sameOrderAList = aList.stream().collect(toList());
        System.out.println("sameOrderAList = " + sameOrderAList);
        List<Integer> aListSorted = aList.stream().sorted().collect(toList());
        System.out.println("aListSorted = " + aListSorted);

        Set<Integer> aSet = new HashSet<>(asList(10, 3, 5, 9));
        System.out.println("aSet = " + aSet);
        List<Integer> sameOrderASet = aSet.stream().collect(toList());
        System.out.println("sameOrderASet = " + sameOrderASet);
        List<Integer> aSetSorted = aSet.stream().sorted().collect(toList());
        System.out.println("aSetSorted = " + aSetSorted);

//        List<Track>
//                Album allTrackOfOE = SampleData.Mira.getTracks().stream().collect(toList())
        List<String> allTrackOfOEMira = SampleData.Mira.getTrackList().stream()
                .map(Track::getName)
                .collect(toList());
        System.out.println("allTrackOfOEMira = " + allTrackOfOEMira);
    }
}
