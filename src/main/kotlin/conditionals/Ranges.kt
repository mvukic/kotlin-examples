package conditionals

// Range of letters
// Range of numbers

// Key work: in, !n

fun main() {

  val letters = 'a'..'g'
  println(letters.toList())

  val numbers = 0..10
  println(numbers.toList())



  if ('b' in letters) {
    println("Is in")
  }

  if ('j' !in letters) {
    println("Is not in")
  }


}