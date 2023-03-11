package Task06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ParallelCollectionProcessing {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int min = list.parallelStream().mapToInt(Integer::intValue).min().getAsInt();
        System.out.println("Min value: " + min);

        int max = list.parallelStream().mapToInt(Integer::intValue).max().getAsInt();
        System.out.println("Max value: " + max);

        double average = list.parallelStream().mapToInt(Integer::intValue).average().getAsDouble();
        System.out.println("Average value: " + average);

        List<Integer> filteredList = list.parallelStream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println("Filtered list: " + filteredList);
    }
}
