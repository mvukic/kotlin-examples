package basic.functions

class Address(val street: String)
class Person(val name: String, var address: Address) {

  infix fun livesAt(newAddress: Address) {
    this.address = newAddress
  }

}

fun main() {
  val address1 = Address("Street name 1")
  val person1 = Person("Person1", address1)

  val address2 = Address("Street name 2")

  person1 livesAt address2


  // maps
  val numbers: Map<String, Int> = mapOf(
    Pair("1", 1),
    "2" to 2,
    "2".to(3),
  )

}
