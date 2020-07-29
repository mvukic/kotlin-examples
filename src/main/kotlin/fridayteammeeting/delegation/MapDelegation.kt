package fridayteammeeting.delegation

// One common use case is storing the values of properties in a map
// This comes up often in applications like parsing JSON or doing other “dynamic” things

// 1. create user class
class User(map: Map<String, Any>) {

  // 4. add this things
  val first: String by map
  val last: String by map
  val age: Int by map
}


fun main() {
  // 2. create this map as if it was some json parsed data
  val dataFromJson = mapOf<String, Any>(
    "first" to "First",
    "last" to "Last",
    "age" to 25
  )
  // 3. write this
  val user = User(dataFromJson)
  println(user.first)
  println(user.last)
  println(user.age)
}