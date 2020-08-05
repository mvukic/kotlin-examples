package operators

// 1. create bag class
class Bag(val volume: Int = 0) {

  val items = mutableListOf<String>()

  // 4. add this method
  operator fun plus(bag: Bag): Bag {
    return Bag(volume + bag.volume)
  }

  // 6. add this methods
  operator fun plus(item: String): Bag {
    items.add(item)
    return this
  }

  operator fun minus(item: String): Bag {
    items.remove(item)
    return this
  }

}

// https://kotlinlang.org/docs/reference/operator-overloading.html
fun main() {

  // 2. create two bags
  val bag1 = Bag(10)
  val bag2 = Bag(5)

  // 3. add two bags for a new one
  val newBag = bag1 + bag2
  println(newBag.volume)

  // 5. add this method
  newBag + "Item1"
  newBag + "Item2"
  println(newBag.items)
}