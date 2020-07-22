package operators

class Bag(val volume: Int = 0) {

  val items = mutableListOf<String>()

  operator fun plus(bag: Bag): Bag {
    return Bag(this.volume + bag.volume)
  }

  operator fun plus(item: String) {
    this.items.add(item)
  }

  operator fun minus(item: String) {
    this.items.remove(item)
  }


}


fun main() {

  val bag1 = Bag(10)
  val bag2 = Bag(5)

  // add two bags for a new one
  val newBag = bag1 + bag2
  println(newBag.volume)

  newBag + "Item1"
  newBag + "Item2"
  println(newBag.items)


}