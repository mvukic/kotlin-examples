package fridayteammeeting.map;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaMap {

    // Static initialization
    public static Map<String, String> javaMap0;
    static {
        javaMap0 = new HashMap<>();
        javaMap0.put("Key1", "Value1");
        javaMap0.put("Key2", "Value3");
    }

    public static void main(String[] args) {
        // Mutable map
        Map<String, String> javaMap1 = new HashMap<>();
        javaMap1.put("Key1", "Value1");
        javaMap1.put("Key2", "Value2");

        // Mutable map
        Map<String, String> javaMap2 = Stream.of(new String[][] {
                { "Key1", "Value1"},
                { "Key2", "Value2" },
        }).collect(Collectors.toMap(data -> data[0], data -> data[1]));

        // Mutable map
        Map<String, String> javaMap3 = Stream.of(
                new AbstractMap.SimpleEntry<>("Key1", "Value1"),
                new AbstractMap.SimpleEntry<>("Key2", "Value2"))
            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        // Immutable map
        Map<String, String> javaMap4 = Map.of(
                "key1","Value1",
                "key2", "Value2"
        );

        // Immutable map
        Map<String, String> javaMap5 = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("key1","Value1"),
                new AbstractMap.SimpleEntry<>("key2", "Value2")
        );

        // Factory methods always produce immutable maps
        // To have a mutable map with some initial data we need to manually put the items in or use stream


    }

}
