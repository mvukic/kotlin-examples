package basic.dataclasses

fun main() {

  // named parameters
  // default parameters (classes and methods)
  val personKotlin = PersonKotlin(name = "Name", age = 20)
  println(personKotlin)
  val olderPersonKotlin = personKotlin.copy(age = 25)
  println(olderPersonKotlin)
  // data classes can be destructured
  val (name, age) = personKotlin

  // converts get/set to property
  val personJava = PersonJava("JavaName", 25)
  personJava.age = 30
  println(personJava)

}