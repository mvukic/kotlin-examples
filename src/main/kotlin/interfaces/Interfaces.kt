package interfaces

open class Animal(open val name: String)

interface WithLegs {
  val numberOfLegs: Int
}

interface WithFur {
  val furColor: String
}

abstract class AnimalWithLegsAndFur(override val name: String) : Animal(name), WithLegs, WithFur





fun <T> animalWithLegs(animal: T) where T: Animal, T: WithLegs {
  println("Animal '${animal.name}' has '${animal.numberOfLegs}' legs")
}

fun <T> animalWithFur(animal: T) where T: Animal, T: WithFur {
  println("Animal '${animal.name}' has fur with color '${animal.furColor}'")
}

fun <T: AnimalWithLegsAndFur> animalWithFurAndLegs(animal: T) {
  println("Animal '${animal.name}' has ${animal.numberOfLegs}' and fur of '${animal.furColor}' color")
}




fun main() {
  val dog = object : Animal("dog"), WithLegs, WithFur {
    override val numberOfLegs = 4
    override val furColor = "red"
  }

  val dog2 = object : AnimalWithLegsAndFur("dog") {
    override val numberOfLegs = 4
    override val furColor = "red"
  }

  animalWithFur(dog)
  animalWithLegs(dog)
  animalWithFurAndLegs(dog2)
}
