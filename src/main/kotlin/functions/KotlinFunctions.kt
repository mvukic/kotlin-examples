package functions


// can be top level in a file
// instead of void it returns Unit
fun main(): Unit {

  // nested functions
  fun nested() {

  }


  // default and named values
  defaultArgs()
  defaultArgs("arg1 value")
  defaultArgs(arg1 = "arg1 value")

  val value = "Some value"

  // version 1 - named lambda function
  val mappedValue1 = map(value, mapper = { argument ->
    argument.toLowerCase()
  })

  // version 2 - lambda function
  val mappedValue2 = map(value, { argument ->
    argument.toLowerCase()
  })

  // version 3 - anonymous function
  val mappedValue3 = map(value, fun (argument: String): String {
    return argument.toLowerCase()
  })

  // version 4 - function reference
  val mappedValue4 = map(value, ::customToLowerCase)

  // version 5 - use it and move outside of the parenthesis
  val mappedValue5 = map(value) {
    it.toLowerCase()
  }

}

fun defaultArgs(arg1: String = "default") {

}

// anonymous and lambda functions
fun map(name: String, mapper: (String) -> String): String {
  return mapper(name)
}

fun customToLowerCase(argument: String): String {
  return argument.toLowerCase()
}