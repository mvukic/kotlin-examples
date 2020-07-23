package extensions



 class Bag(var volume: Int = 0) {

   var type: String = "plastic"

   fun printMe() {
     println("Volume is $volume")
   }

 }


fun main() {

  val bag = Bag(12)



  // Used when initializing a class (similar to C#)
  val returnValue1 = bag.apply {
    // Return value is the object it was  called on (in this case Bag class)
  }

  val bagWithInit = Bag().apply {
    volume = 10
    type = "green"
  }



  // useful when doing some object processing
  val returnValue2 = bag.run {
    // do something and return a value
    this.volume + 5
  }

 val bag2 = Bag().also { bag ->
    // received bag as a parameter
  }



  val biggerBag1 = copyBagWithMoreVolume(bag, 3) {
    Bag(volume * 3)
  }
  val biggerBag2 = copyBagWithMoreVolume(bag, 3) {
    Bag(volume + 3)
  }


}


fun copyBagWithMoreVolume(bag: Bag, increase: Int, fn: Bag.(Int) -> Bag): Bag {
  return bag.fn(increase)
}