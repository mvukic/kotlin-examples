package collections

fun main() {

  // List java way
  val namesJavaWay = ArrayList<String>()
  namesJavaWay.add("Name 1")
  namesJavaWay.add("Name longer  1")
  namesJavaWay.add("Name 3")
  namesJavaWay.add("Name longer 2")

  // List kotlin way
  val names = listOf("Name 1", "Name longer  1", "Name 3", "Name longer 2")

  forLoops(names)
  functional(names)
  sequences()
}
























fun forLoops(names: List<String>) {
  // For loop
  for (name: String in names) {
    println(name)
  }

  // Indexed for loop
  for ((index, name) in names.withIndex()) {
    println("Index: $index, Names: $name")
  }


  for (i: Int in names.indices) {
    println(names[i])
  }

  // Indexed for each
  names.forEachIndexed { index, name ->
    println("Index: $index, Names: $name")
  }
}























fun functional(names: List<String>) {
  // Native support for functional concepts (e.g. filter, map, flatMap, ...)
  val uppercaseNames = names.filter { name -> name.length > 8 }.map { name -> name.toUpperCase() }
  println(uppercaseNames)
}






















fun sequences() {
  // Generate first 10 even numbers
  // Sequences - like Streams in java but simplified and more powerful
  val evenNumbers = generateSequence(0, { prev -> prev + 1 }).filter { number -> number % 2 == 0 }.take(10).toList()
  println(evenNumbers)
}
