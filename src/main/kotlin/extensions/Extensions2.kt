package extensions

import java.math.BigDecimal

// extension property for number conversion
// when hovering over .bd intellij will give an option to create extension property

// extension function for number conversion
// when hovering over .bd intellij will give an option to create extension property


private val Int.bd: BigDecimal
  get() {
    return BigDecimal(this)
  }

fun main() {
  
  val number = 12

  val bigDecimal1: BigDecimal = number.bd
  val bigDecimal2: BigDecimal = number.asBigDecimal()

}

private fun Int.asBigDecimal(): BigDecimal {
  return BigDecimal(this)
}
