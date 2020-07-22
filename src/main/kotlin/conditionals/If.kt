package conditionals


// If can be used as
// - statement
// - expression

// No ternary operator


// As statement
fun maxOf1(a: Int, b: Int): Int {
  if (a > b) {
    return a
  } else {
    return b
  }
}

// As expression
fun maxOf2(a: Int, b: Int): Int {
  return if (a > b) {
    a
  } else {
    b
  }
}

// As expression
fun maxOf3(a: Int, b: Int) =
  if (a > b) {
    a
  } else {
    b
  }

// As expression
fun maxOf4(a: Int, b: Int) = if (a > b) a else b
