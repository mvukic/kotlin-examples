package basic.extensions

fun main() {
  val name = "Name"
  println(name.repeatTwiceFun())
  println(name.repeatedTwice)

}

// Extension function
fun String.repeatTwiceFun(): String {
  return "$this$this"
}

// Extension property
val String.repeatedTwice: String
  get() = "$this$this"