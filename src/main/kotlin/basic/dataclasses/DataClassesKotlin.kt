package basic.dataclasses

fun main() {

  javaUsage()
  kotlinUsage()

}






















fun kotlinUsage() {
  // named parameters
  // default parameters (classes and methods)
  val personKotlin = PersonKotlin(name = "Name", age = 20)
  println(personKotlin)

  // Copy methods
  val olderPersonKotlin = personKotlin.copy(age = 25)
  println(olderPersonKotlin)

  // data classes can be destructured
  val (name, age) = personKotlin
  println(name)
}

























fun javaUsage() {
  // converts get/set to property
  val personJava = PersonJava("JavaName", 25, "email")
  personJava.age = 30
  println(personJava)
}