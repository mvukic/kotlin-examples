package map

data class Bag(val volume: Int = 0, val type: String = "plastic")


fun main() {


  val bags = listOf(
    Bag(10, type = "green"),
    Bag(3),
    Bag(5, type = "green"),
    Bag(5),
    Bag(7, type = "leather"),
    Bag(7, type = "paper")
  )

  // sum bags by their volume
  var sumOfVolumes = 0
  for (bag in bags) {
    sumOfVolumes += bag.volume
  }
  println("Sum is $sumOfVolumes")
  val sum = bags.sumBy { it.volume }
  println("Sum is $sum")

  // get max item, by some condition
  val largestBag: Bag? = bags.maxBy { it.volume }
  print("Largest bag is: ")
  println(largestBag)
  // get max item, by some condition
  val smallestBag: Bag? = bags.minBy { it.volume }
  print("Smallest bag is: ")
  println(smallestBag)

  // separate by some limit
  val partitionBySize = bags.partition { it.volume > 5 }
  val (bigBags, smallBags) = partitionBySize
  println(smallBags)
  println(bigBags)

  // group by type
  val groupedByType = bags.groupBy { it.type }
  groupedByType.forEach { (type, sameBags) ->
    println("Type is $type")
    print("\t")
    println(sameBags)
  }

}