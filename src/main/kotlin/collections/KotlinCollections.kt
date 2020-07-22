package collections

import java.util.stream.Collectors

// define collections using build methods
// - differentiates mutable collections


// String list
// - for loop
// - foreach


// String array
// - not available in kotlin
// - but has: IntArray, ShortArray


// String map
// - for entry
// - for key, value pairs
// - forEach entry
// - forEach key, value pairs
// - implement to function and change it to infix


// filter and map using stream and native extension methods

fun main() {
    val stringList = listOf(
        "Str 1",
        "Str Str 2",
        "Str 3",
        "Str Str 4"
    )
    for (value in stringList) {
        println(value)
    }
    stringList.forEach { value ->
        println(value)
    }

    val intArray = intArrayOf(
        1,
        2,
        3
    )
    intArray.forEach { value ->
       println(value)
    }


    val stringMap = mapOf(
        Pair("Key1", "Value1"),
        Pair("Key2", "Value2"),
        Pair("Key3", "Value3"),
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








    val longValues = stringList
        .stream()
        .filter { value -> value.length > 4 }
        .map { value -> "$value-$value" }
        .collect(Collectors.toList())

    for (value in longValues) {
        println(value)
    }


}

fun <A, B> A.withValue(that: B): Pair<A, B> {
    return Pair(this, that)
}