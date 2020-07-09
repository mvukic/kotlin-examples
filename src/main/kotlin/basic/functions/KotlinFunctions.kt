package basic.functions

fun main() {
  val name = "Name"
  someFunction(name)

  funAsParameter(name, { value -> value })
  funAsParameter(name) {value ->
    "$value$value"
  }

  funAsParameter(name) {
    "$it$it"
  }

  // function as a value
  val funAsValue: (String) -> String = {value -> "$value$value"}
  println(funAsValue("name"))

}

// top level in a file
fun someFunction(name: String): String {
  return "$name$name"
}
// shorter
fun someFunction2(name: String) = "$name$name"


fun funAsParameter(name: String, func: (String) -> String): String {
  println(name)
  return func(name)
}