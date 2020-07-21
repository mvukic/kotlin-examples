package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// String list
// - for loop
// - foreach


// String array
// - for loop


// String map
// - for loop entry
// - forEach key, value pairs

public class JavaSimpleCollections {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Str 1");
        stringList.add("Str 2");
        stringList.add("Str 3");
        for(String value : stringList) {
            System.out.println(value);
        }
        stringList.forEach(value -> {
            System.out.println(value);
        });

        System.out.println();

        String[] stringArray = new String[] {
            "Str 1",
            "Str 2",
            "Str 3"
        };
        for (String value: stringArray) {
            System.out.println(value);
        }

        System.out.println();

        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("Key1", "Value1");
        stringMap.put("Key2", "Value2");
        stringMap.put("Key3", "Value3");
        for (Map.Entry<String, String> entry : stringMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        stringMap.forEach((key, value) -> {
            System.out.println(key + " -> " + value);
        });


    }

}
