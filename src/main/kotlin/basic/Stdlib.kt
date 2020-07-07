package basic

fun main() {
  var name = "name"

  val returnsLength = name.let {
    println("let Length is ${it.length}")
    it.length
  }

  val returnsThis: String = name.apply {
    println("apply Length is $length")
  }

  // instead of writing a lot of object.property
  // “with this object, do the following.”
  val length2 = with(name) {
    println("with Length is $length")
    length
  }

  val length3 = name.run {
    println("run Length is $length")
    length
  }

  var nullableName: String? = null

  val newName = nullableName?.let {
    val uppercase = it.toUpperCase()
    "Not null: $uppercase"
  } ?: "Nullable name was null"

}