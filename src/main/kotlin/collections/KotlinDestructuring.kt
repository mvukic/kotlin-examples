package collections

fun main() {

  // List Kotlin way
  val names = listOf("Name 1", "Name longer  1", "Name f 3", "Name longer 2")

  // Example: partitioning - split collection into two categories
  val partitions: Pair<List<String>, List<String>> = names.partition { name -> name.length > 8 }
  println(partitions)

  // Destructuring
  val (long, short) = partitions
  println("Long: $long")
  println("Short: $short")
}