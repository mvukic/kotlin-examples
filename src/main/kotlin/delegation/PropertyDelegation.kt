package delegation


// https://kotlinlang.org/docs/reference/delegated-properties.html
fun main() {

  // Lazy delegation
  // calculates only on first access


  val lazyValue: String by lazy {
    Thread.sleep(5000)
    "Lazy value"
  }

  println(lazyValue)
  println(lazyValue)
  println(lazyValue)
  println(lazyValue)
  println(lazyValue)
  println(lazyValue)

}