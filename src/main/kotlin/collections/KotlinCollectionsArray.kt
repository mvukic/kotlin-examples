package collections


// String array


fun main() {

  // arrayOf build function
  val stringArray = arrayOf(
    "Str 1",
    "Str Str 2",
    "Str 3",
    "Str Str 4"
  )


  // Predefined for primitive type: IntArray, ShortArray
  val intArray = intArrayOf(1, 2, 3)
  intArray.forEach { value ->
    println(value)
  }

  val shortArray = shortArrayOf(1, 2, 3, 4)

}