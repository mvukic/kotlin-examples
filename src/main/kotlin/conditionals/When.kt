package conditionals

// Java switch-case but better in every way

fun main() {
  checkNumber1(13)
}

// Regular when
fun checkNumber1(number: Int) {
  when (number) {
    1 -> println("Is 1")
    2 -> println("Is 2")
    else -> println("not 1 or 2")
  }
}

// When as an expression
fun checkNumber2(number: Int): String {
  when (number) {
    1 -> return "Is 1"
    2 -> return "Is 2"
    else -> return "not 1 or 2"
  }
}

// when using in key word
fun checkNumber3(number: Int): String {
  val goodNumbers = listOf(15, 22, 45)
  return when (number) {
    in 0..10 -> "Is between 0 and 10" // using range
    in goodNumbers -> "Is good" // using list
    in listOf(20, 11) -> "is 20 or 11" // defining and then using a list
    !in listOf(80, 77) -> "Not 80 or 77"
    else -> "don't know!"
  }
}

// Smart cast
// Compiler knows that in specific branch the type is String
fun hasPrefix(value: Any, prefix: String): Boolean {
  return when (value) {
    is String -> value.startsWith(prefix)
    else -> false
  }
}


// When using classes, is key word
fun checkClass1(shape: Shape): String {
  return when (shape) {
    is Circle -> "Circle"
    is Triangle -> "Triangle"
    is Square -> "Square"
    else -> "Unknown shape"
  }
}
// When using sealed classes
fun checkClass2(shape: Shape): String {
  return when (shape) {
    is Circle -> "Circle"
    is Triangle -> "Triangle"
    is Square -> "Square"
    else -> "Unknown shape"
  }
}

open class Shape(val name: String)
class Circle() : Shape("Circle")
class Triangle() : Shape("Triangle")
class Square() : Shape("Square")
