package variance

sealed class Shape(open val name: String)
class Circle : Shape("Circle")
class Rectangle : Shape("Rectangle")

// out  -> class methods can only return T, not receive it
class ContainerOut<out T>(val t: T) {

  fun produce(): T {
    return t
  }

}

class ContainerIn<in T>(t: T) {

  fun consume(t: T) {
    println(t)
  }

}

fun main() {
  val circle = Circle()
  val containerOut: ContainerOut<Shape> = ContainerOut<Circle>(circle)
}