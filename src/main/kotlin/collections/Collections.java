package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Collections {

    public static void main(String[] args) {

        // List
        List<String> names = new ArrayList<>();
        names.add("Name 1");
        names.add("Name longer  1");
        names.add("Name f 3");
        names.add("Name longer 2");

        // map + filter using for loops
        List<String> uppercaseNames = new ArrayList<>();
        for (String name : names) {
            if (name.length() > 8) {
                uppercaseNames.add(name.toUpperCase());
            }
        }
        System.out.println(uppercaseNames);

        List<String> uppercaseFromStream = names.stream().filter(name -> name.length() > 8).map(name -> name.toUpperCase()).collect(Collectors.toList());
        System.out.println(uppercaseFromStream);

        // Partition data
        Map<Boolean, List<String>> partitions = names.stream().collect(Collectors.partitioningBy(name -> name.length() > 8));
        System.out.println("Long:");
        System.out.println(partitions.get(true));
        System.out.println("Short:");
        System.out.println(partitions.get(false));


        // Generate first 10 even numbers
        List<Integer> oddNumbers10 = IntStream.iterate(0, prev -> prev + 1).filter(number -> number % 2 == 0).limit(10).boxed().collect(Collectors.toList());
        System.out.println(oddNumbers10);
    }
}
