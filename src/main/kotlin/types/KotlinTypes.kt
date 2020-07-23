package types

fun main() {
  // the same (mostly) types as in Java
  // - unboxed (if possible) during compile time
  // - no primitive values
  val a: String = "a"
  val b: Int = 12
  val c: Double = 12.1
  val d: Float = 12.1f


  // explicit mutability and nullability
  val e: String? = null

  // if e is null, this line will never be executed
  e?.length

  // Strongly discouraged
  //  e!!.length

  // smart cast
  if (e != null) {
    println(e.length)
  }


  // function types
  val functionType: (Int) -> String

  // anonymous object
  val customObject = object {
    val a = "a"
    val b = 12
  }
}

// type aliases
// - alternative types for existing names
// - will be replaced during compile time
typealias SomeAlias = Map<String, Map<Int, List<String>>>