package delegation

import kotlin.properties.Delegates


fun main() {
  lazy()
//  observe()
//  byMap()
//  veto()
}












fun lazy() {
  val lazyValue: String by lazy {
    println("computed!")
    "Hello"
  }
  println(lazyValue)
}
















class UserObserve {
  var name: String by Delegates.observable("<no name>") { property, oldValue, newValue ->
    println("$oldValue -> $newValue")
  }
}
fun observe() {
  val user = UserObserve()
  user.name = "first"
  user.name = "second"
}



















class UserFromMap(map: Map<String, Any?>) {
  val name: String by map
  val age: Int     by map
}
fun byMap() {
  val userFromMap = UserFromMap(mapOf(
    "name" to "Name",
    "age" to 20
  ))
  println(userFromMap)
}















class UserVeto {
  var name: String by Delegates.vetoable("<no name>") { property, oldValue, newValue ->
    println("$oldValue -> $newValue")
    newValue.length < 7
  }
}
fun veto() {
  val user = UserVeto()
  user.name = "Short1"
  user.name = "LongNameLongName"
  user.name = "Short2"
}