package collections.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();

        List<Integer>  list1 = new ArrayList<>();

        list1.addAll(List.of(1,2,3,4,5,6,7,9,1,2,3,4,5,6,7,8,9));
        set1.addAll(Set.of(1,2,3,4,5,6,7,9));


        set1.add(2);

        var set2 = Set.copyOf(list1);


        System.out.println(set2.stream().sorted().toList().reversed());
        System.out.println(list1);

    }

}
