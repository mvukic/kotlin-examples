package collections

fun main() {

  // List java way
  val namesJavaWay= ArrayList<String>()
  namesJavaWay.add("Name 1")
  namesJavaWay.add("Name longer  1")
  namesJavaWay.add("Name f 3")
  namesJavaWay.add("Name longer 2")

  val namesJavaWayUppercase = ArrayList<String>()
  for (name in namesJavaWay) {
    if (name.length > 8) {
      namesJavaWayUppercase.add(name.toUpperCase())
    }
  }
  println(namesJavaWayUppercase)


  // List Kotlin way
  val names = listOf("Name 1", "Name longer  1", "Name f 3", "Name longer 2")
  val uppercase = names.filter { name -> name.length > 8 }.map { name -> name.toUpperCase() }
  println(uppercase)

  // partitioning
  val partitions: Pair<List<String>, List<String>> = names.partition { name -> name.length > 8 }
  println(partitions)

  // Destructuring
  val (long, short) = partitions
  println("Long: $long")
  println("Short: $short")

  // Generate first 10 even numbers
  val evenNumbers = generateSequence(0) { prev -> prev + 1 }.filter { number -> number % 2 == 0 }.take(10).toList()
  println(evenNumbers)
    
}