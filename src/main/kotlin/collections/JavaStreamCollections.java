package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Java 8 introduced streams which added functional stuff
// - map
// - filter
// - partition
// - ...



public class JavaStreamCollections {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Str 1");
        stringList.add("Str str 2");
        stringList.add("Str 3");
        stringList.add("Str str 4");


        List<String> longValues = stringList
                .stream()
                .filter(value -> value.length() > 4)
                .map(value -> value + "-" + value)
                .collect(Collectors.toList());
        for (String value : longValues) {
            System.out.println(value);
        }

    }

}
