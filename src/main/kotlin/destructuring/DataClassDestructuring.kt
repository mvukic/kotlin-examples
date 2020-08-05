package destructuring


data class Person(val name: String, val age: Int)


// https://kotlinlang.org/docs/reference/multi-declarations.html
fun main() {

  //1. data class
  val person = Person("Name", 25)
  val (name, age) = person
  println("$name $age")

  //2. return multiple values - Pair
  val (content, status) = callSomeApi1()
  println("$content $status")

  //2. return multiple values - Triple
  val (content1, status2,  time) = callSomeApi2()
}




fun callSomeApi1(): Pair<String, Int> {
  // call an api
  return Pair("Content", 200)
}

fun callSomeApi2(): Triple<String, Int, Int> {
  // call an api
  return Triple("Content", 200, 300)
}