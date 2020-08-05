package recursion

tailrec fun sum(x: Int, total: Int = 0): Int
  = if(x == 0) total else sum(x - 1, total + x)

fun main() {
  println(sum(5))
}