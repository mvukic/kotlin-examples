package collections

import java.util.stream.Collectors



fun main() {

  // filter and map using stream and native extension methods
  val stringList = listOf("Str 1", "Str Str 2", "Str 3", "Str Str 4")

  // Remove stream and collect here
  val longValues = stringList
    .stream()
    .filter { value -> value.length > 4 }
    .map { value -> "$value-$value" }
    .collect(Collectors.toList())

  for (value in longValues) {
    println(value)
  }




  data class Bag(val volume: Int = 0, val type: String = "plastic")
  // sum bags by their volume
  val bags = listOf(
    Bag(10, type = "green"),
    Bag(3),
    Bag(5, type = "green"),
    Bag(5),
    Bag(7, type = "green")
  )

  // we can do this, BUT
  var sumOfVolumes = 0
  for (bag in bags) {
    sumOfVolumes += bag.volume
  }

  // kotlin way
  val sum = bags.sumBy { it.volume }
  println(sum)






  // Partition bags by size
  // java way
  val partitioned = bags.stream().collect(Collectors.partitioningBy { e -> e.volume > 5 })
  // kotlin way
  val bagsBySize2 = bags.partition { it.volume > 5 }
  println(bagsBySize2)
  // Pair is a data class so it can be de-structured
  val (big, small) = bags.partition { it.volume > 5 }
  println(big)
  println(small)

  // Group bags by type
  // java way
  val groupedByVolumeJava = bags.stream().collect(Collectors.groupingBy(Bag::type))
  val groupedByVolumeJava2 = bags.stream().filter { bag -> bag.volume > 5 }.collect(Collectors.groupingBy(Bag::type))

  // kotlin way
  val groupedByVolume = bags.groupBy { it.type }
  println(groupedByVolume)


}