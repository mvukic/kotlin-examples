package collections


fun main() {

  // define collections using build methods
// - differentiates mutable collections
  val stringList = listOf(
    "Str 1",
    "Str Str 2",
    "Str 3",
    "Str Str 4"
  )

  val stringList2 = mutableListOf(
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
}