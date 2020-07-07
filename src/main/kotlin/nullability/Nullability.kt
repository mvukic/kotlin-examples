package nullability

fun main() {

    // not nullable, immutable
    val name1 = "Non-nullable"

    // nullable, mutable
    var name2: String? = "Nullable"

    println(name1.toUpperCase())
//    println(name2.toLowerCase())

    // compiler inferred non null
    if (name2 != null) {
        println(name2.toUpperCase())
    }

    println(name2?.length)

    name2 = null
    println(name2?.length)

    // elvis operator (if the left is null then execute/return on the right)
    println(name2 ?: "It was null")
    var fullName: String? = "first last"
    println(fullName?.split(" ")?.first() ?: "Full name not defined")

}