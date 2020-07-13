package extra

fun main() {

    // Ranges
    val numbers = (1..10).toList()
    println(numbers)

    val letters = ('a'..'z').toList()
    println(letters)

    // Loop over range
    for (number in 10 downTo 1) {
        print("$number ")
    }
    println()
    for (number in 1 until 10) {
        print("$number ")
    }
    println()

    // union, intersect, subtract
    val goodNumbers = setOf(0, 1, 2, 3, 4, 5)
    val badNumbers = setOf(5, 6, 7, 8, 9)

    println("Union:")
    println(goodNumbers union badNumbers)
    println("Intersect:")
    println(goodNumbers intersect badNumbers)
    println("Subtract:")
    println(goodNumbers subtract badNumbers)


    // join list
    val message = goodNumbers.joinToString(
        separator = ", ",
        prefix = "[",
        postfix = "]",
        truncated = "etc...",
        limit = 3,
        transform = { value -> "'$value'" }
    )
    println(message)
}