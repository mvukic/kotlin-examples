package basic.functions

fun main() {

  callingAFunction()
  functionAsAValue()

}



fun notReturning(): Unit {
  println("No return type (Actually it is Unit)")
}

















fun nameMapper(name: String, mapper: (String) -> String): String {
  return mapper(name)
}

fun nameMapperFn(name: String): String {
  return "$name$name"
}

fun callingAFunction() {
  val name = "Name"
  nameMapperFn(name)

  // function reference as a name
  nameMapper(name, ::nameMapperFn)

  // lambda function
  nameMapper(name, { value -> "$value$value" })
  nameMapper(name, { "$it$it" })
  nameMapper(name) { "$it$it" }

  // anonymous function
  nameMapper(name, fun (value: String): String {
      println(value)
      return "$value$value"
  })

}
















fun functionAsAValue() {
  // function stored in a value (nested functions)
  val funAsValue: (String) -> String = { value -> "$value$value" }
  println(funAsValue("name"))
}

