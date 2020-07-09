package basic.types


// type alias
typealias NameType = String
typealias WordProcessor = (String) -> String


// function without parent class
fun main() {

  // type inference
  // no semicolon
  // mutability
  val number: Int = 12
  var name = "Name"

  println("Some name: ${name.toUpperCase()}, some number: $number")

  name = "Some other name"

}