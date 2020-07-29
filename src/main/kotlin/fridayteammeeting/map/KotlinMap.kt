package fridayteammeeting.map

fun main() {

    // String map
    // - for entry
    // - for key, value pairs
    // - forEach entry
    // - forEach key, value pairs
    // - implement to function and change it to infix


    // 1. factory methods
    // 1. mutableMapOf and mapOf
    val kotlinMap = mutableMapOf(
      Pair("Key", "Value1"),
      Pair("Key2", "Value2"),

      // 2. Then do this, and show how extensions simplify this
      // 2. Then turn this into infix function
      // 3. then show that it already exists as "to" in stdlib
      "Key3".withValue("Value3")
    )

    // 3. show how to iterate the map
    for (entry in kotlinMap.entries) {
        println("${entry.key} -> ${entry.value}")
    }
    kotlinMap.forEach { entry ->
        println("${entry.key} -> ${entry.value}")
    }

    // 3. Destructuring of MutableMap.MutableEntry data class
    for ((key, value) in kotlinMap.entries) {
        println("$key -> $value")
    }
    kotlinMap.forEach { (key, value) ->
        println("$key -> $value")
    }

    // 4. Mapping a map to some other map (also supports a lot of extensions)
    val switchedKeyAndValue = kotlinMap.map { Pair(it.value, it.key) }.toMap()

}

fun String.withValue(value: String): Pair<String, String> {
    return Pair(this, value)
}

//fun <A, B> A.withValue(that: B): Pair<A, B> {
//    return Pair(this, that)
//}