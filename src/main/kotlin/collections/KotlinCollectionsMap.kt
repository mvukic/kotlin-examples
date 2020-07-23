package collections

import java.util.stream.Collectors

fun main() {

    // String map
    // - for entry
    // - for key, value pairs
    // - forEach entry
    // - forEach key, value pairs
    // - implement to function and change it to infix

    val stringMap = mapOf(
        Pair("Key1", "Value1"),
        Pair("Key2", "Value2"),
        Pair("Key3", "Value3"),

      // do this, then create that function
        "Key4".withValue("Value4")
    )
    for (entry in stringMap.entries) {
        println("${entry.key} -> ${entry.value}")
    }
    for ((key, value) in stringMap.entries) {
        println("$key -> $value")
    }
    stringMap.forEach { entry ->
        println("${entry.key} -> ${entry.value}")
    }
    stringMap.forEach { (key, value) ->
        println("$key -> $value")
    }





}

fun <A, B> A.withValue(that: B): Pair<A, B> {
    return Pair(this, that)
}